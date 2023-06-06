package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.PublicWork;
import com.areesgod.individualplan.service.PublicWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/publicwork")
@CrossOrigin
public class PublicWorkController {
    @Autowired
    private PublicWorkService publicWorkService;
    @PostMapping("/add")
    public int add(@RequestBody PublicWork publicWork){
        publicWorkService.savePublicWork(publicWork);
        return publicWork.getId();
    }
    @GetMapping("/getAll")
    public List<PublicWork> list(){
        return publicWorkService.getAllPublicWork();
    }
    @GetMapping("/getby/{id}")
    public ResponseEntity<PublicWork> getPublicById(@PathVariable Integer id){
        Optional<PublicWork> publicWorkData = publicWorkService.getPublicById(id);
        if(publicWorkData.isPresent()){
            return new ResponseEntity<>(publicWorkData.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delele/{id}")
    public ResponseEntity<HttpStatus> deletePublicWork(@PathVariable("id") Integer id){
        try {
            publicWorkService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
