package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.BehaviorData;
import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.model.EducationTable;
import com.areesgod.individualplan.model.User;
import com.areesgod.individualplan.service.EducationDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/educationdata")
@CrossOrigin
public class EducationDataController {
    @Autowired
    private EducationDataServiceImpl educationDataService;
    @PostMapping("/add")
    public ResponseEntity<EducationData> saveBehaviorData(@RequestBody EducationData educationData){
        return new ResponseEntity<EducationData>(educationDataService.save(educationData),HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<EducationData>> findAll(){
        return new ResponseEntity<List<EducationData>>(educationDataService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/all/{user_id}")
    public ResponseEntity<List<EducationData>> findByUser(@PathVariable Integer user_id) {

        return new ResponseEntity<List<EducationData>>(educationDataService.findbyUserId(user_id), HttpStatus.OK);

    }
    @DeleteMapping("/delete/{user_id}")
    public int deleteUser(@PathVariable Integer user_id) {

        return educationDataService.deleteByUser(user_id);

    }


}
