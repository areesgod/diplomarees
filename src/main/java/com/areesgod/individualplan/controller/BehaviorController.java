package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.Behavior;
import com.areesgod.individualplan.service.BehaviorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/behavior")
@CrossOrigin
public class BehaviorController {
    @Autowired
    private BehaviorService behaviorService;
    @PostMapping("/add")
    public int add(@RequestBody Behavior behavior){
        behaviorService.saveBehavior(behavior);
        return behavior.getId();
    }
    @GetMapping("/getAll")
    public List<Behavior> list(){
        return behaviorService.getAllBehavior();
    }

    @GetMapping("/getby/{id}")
    public ResponseEntity<Behavior> getBehById(@PathVariable Integer id){
        Optional<Behavior> behaviorData = behaviorService.getBehById(id);
        if(behaviorData.isPresent()){
            return new ResponseEntity<>(behaviorData.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteBehavior(@PathVariable("id") Integer id){
        try{
            behaviorService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
