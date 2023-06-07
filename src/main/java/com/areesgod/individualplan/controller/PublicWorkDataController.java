package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.model.KPIData;
import com.areesgod.individualplan.model.PublicWorkData;
import com.areesgod.individualplan.service.EducationDataServiceImpl;
import com.areesgod.individualplan.service.KPIDataService;
import com.areesgod.individualplan.service.PublicWorkDataService;
import com.areesgod.individualplan.service.PublicWorkDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/publicworkdata")
@CrossOrigin
public class PublicWorkDataController {
    @Autowired
    private PublicWorkDataServiceImpl publicWorkDataService;
    @PostMapping("/add")
    public ResponseEntity<PublicWorkData> saveBehaviorData(@RequestBody PublicWorkData publicWorkData){
        return new ResponseEntity<PublicWorkData>(publicWorkDataService.save(publicWorkData),HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<PublicWorkData>> findAll(){
        return new ResponseEntity<List<PublicWorkData>>(publicWorkDataService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/all/{user_id}")
    public ResponseEntity<List<PublicWorkData>> findByUser(@PathVariable Integer user_id) {

        return new ResponseEntity<List<PublicWorkData>>(publicWorkDataService.findbyUserId(user_id), HttpStatus.OK);

    }
    @DeleteMapping("/delete/{user_id}")
    public int deleteUser(@PathVariable Integer user_id) {

        return publicWorkDataService.deleteByUser(user_id);

    }
}
