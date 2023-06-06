package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.EducationTable;
import com.areesgod.individualplan.model.User;
import com.areesgod.individualplan.repository.EducationRepository;
import com.areesgod.individualplan.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/education")
@CrossOrigin
public class EducationController {
    @Autowired
    private EducationService educationService;


    @PostMapping("/add")
    public int add(@RequestBody EducationTable educationalTable){
        educationService.saveEducationalTable(educationalTable);
        return educationalTable.getId();
    }
    @GetMapping("/getAll")
    public List<EducationTable> list(){
        return educationService.getAllEducation();
    }

    @GetMapping("/getby/{id}")
    public ResponseEntity<EducationTable> getEduById(@PathVariable Integer id){
        Optional<EducationTable> eduData = educationService.getEduById(id);
        if(eduData.isPresent()){
            return  new ResponseEntity<>(eduData.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteEducation(@PathVariable("id") Integer id){
        try {
            educationService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
