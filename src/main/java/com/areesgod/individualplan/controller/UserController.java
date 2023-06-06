package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.User;
import com.areesgod.individualplan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/user/")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/getby/{id}")
    public ResponseEntity <User> getUserById(@PathVariable Long id){
        Optional<User> userData = userRepository.findById(id);
        if(userData.isPresent()){
            return  new ResponseEntity<>(userData.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("update/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user){
        Optional<User> userData = userRepository.findById(id);
        if(userData.isPresent()){
            User _user = userData.get();
            _user.setRoles(user.getRoles());
            _user.setEmail(user.getEmail());
            _user.setUsername(user.getUsername());
            _user.setPassword(user.getPassword());
            return new ResponseEntity<>(userRepository.save(_user),HttpStatus.OK);
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") Long id){
        try {
            userRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
