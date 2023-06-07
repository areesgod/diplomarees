package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.model.PublicWorkData;
import com.areesgod.individualplan.model.ScienceData;
import com.areesgod.individualplan.service.EducationDataServiceImpl;
import com.areesgod.individualplan.service.PublicWorkDataService;
import com.areesgod.individualplan.service.ScienceDataService;
import com.areesgod.individualplan.service.ScienceDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sciencedata")
@CrossOrigin
public class ScienceDataController {
    @Autowired
    private ScienceDataServiceImpl scienceDataService;
    @PostMapping("/add")
    public ResponseEntity<ScienceData> saveBehaviorData(@RequestBody ScienceData scienceData){
        return new ResponseEntity<ScienceData>(scienceDataService.save(scienceData),HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<ScienceData>> findAll(){
        return new ResponseEntity<List<ScienceData>>(scienceDataService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/all/{user_id}")
    public ResponseEntity<List<ScienceData>> findByUser(@PathVariable Integer user_id) {

        return new ResponseEntity<List<ScienceData>>(scienceDataService.findbyUserId(user_id), HttpStatus.OK);

    }
    @DeleteMapping("/delete/{user_id}")
    public int deleteUser(@PathVariable Integer user_id) {

        return scienceDataService.deleteByUser(user_id);

    }
}
