package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.Science;
import com.areesgod.individualplan.service.ScienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/science")
@CrossOrigin
public class ScienceController {
    @Autowired
    private ScienceService scienceService;
    @PostMapping("/add")
    public int add(@RequestBody Science science){
        scienceService.saveScience(science);
        return science.getId();
    }
    @GetMapping("/getAll")
    public List<Science> list(){
        return scienceService.getAllScience();
    }

    @GetMapping("/getby/{id}")
    public ResponseEntity<Science> getSciById(@PathVariable Integer id){
        Optional<Science> sciData = scienceService.getSciById(id);
        if(sciData.isPresent()){
            return new ResponseEntity<>(sciData.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteSci(@PathVariable("id") Integer id){
        try{
            scienceService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
