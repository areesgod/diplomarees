package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.EduMethData;
import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.repository.EduMethDataRepository;
import com.areesgod.individualplan.service.EduMethDataService;
import com.areesgod.individualplan.service.EduMethDataServiceImpl;
import com.areesgod.individualplan.service.EducationDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/edumethdata")
@CrossOrigin
public class EduMethDataController {
    @Autowired
    private EduMethDataServiceImpl eduMethDataService;
    @PostMapping("/add")
    public ResponseEntity<EduMethData> saveBehaviorData(@RequestBody EduMethData eduMethData){
        return new ResponseEntity<EduMethData>(eduMethDataService.save(eduMethData),HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<EduMethData>> findAll(){
        return new ResponseEntity<List<EduMethData>>(eduMethDataService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/all/{user_id}")
    public ResponseEntity<List<EduMethData>> findByUser(@PathVariable Integer user_id) {

        return new ResponseEntity<List<EduMethData>>(eduMethDataService.findbyUserId(user_id), HttpStatus.OK);

    }
    @DeleteMapping("/delete/{user_id}")
    public int deleteUser(@PathVariable Integer user_id) {

        return eduMethDataService.deleteByUser(user_id);

    }
}
