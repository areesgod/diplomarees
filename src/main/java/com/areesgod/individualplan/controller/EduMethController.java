package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.EduMeth;
import com.areesgod.individualplan.service.EduMethService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/edumeth")
@CrossOrigin
public class EduMethController {
    @Autowired
    private EduMethService eduMethService;
    @PostMapping("/add")
    public int add(@RequestBody EduMeth eduMeth){
        eduMethService.saveEduMeth(eduMeth);
        return eduMeth.getId();
    }
    @GetMapping("/getAll")
    public List<EduMeth> list(){
        return eduMethService.getAllEduMeth();
    }

    @GetMapping("/getby/{id}")
    public ResponseEntity<EduMeth> getEduMethById(@PathVariable Integer id){
        Optional<EduMeth> eduMethData = eduMethService.getEduMethById(id);
        if(eduMethData.isPresent()){
            return  new ResponseEntity<>(eduMethData.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteEduMeth(@PathVariable("id") Integer id){
        try{
            eduMethService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
