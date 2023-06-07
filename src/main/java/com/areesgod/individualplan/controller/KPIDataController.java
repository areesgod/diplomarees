package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.EduMethData;
import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.model.KPIData;
import com.areesgod.individualplan.service.EduMethDataService;
import com.areesgod.individualplan.service.EducationDataServiceImpl;
import com.areesgod.individualplan.service.KPIDataService;
import com.areesgod.individualplan.service.KPIDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/kpidata")
@CrossOrigin
public class KPIDataController {
    @Autowired
    private KPIDataServiceImpl kpiDataService;
    @PostMapping("/add")
    public ResponseEntity<KPIData> saveBehaviorData(@RequestBody KPIData kpiData){
        return new ResponseEntity<KPIData>(kpiDataService.save(kpiData),HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<KPIData>> findAll(){
        return new ResponseEntity<List<KPIData>>(kpiDataService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/all/{user_id}")
    public ResponseEntity<List<KPIData>> findByUser(@PathVariable Integer user_id) {

        return new ResponseEntity<List<KPIData>>(kpiDataService.findbyUserId(user_id), HttpStatus.OK);

    }
    @DeleteMapping("/delete/{user_id}")
    public int deleteUser(@PathVariable Integer user_id) {

        return kpiDataService.deleteByUser(user_id);

    }
}
