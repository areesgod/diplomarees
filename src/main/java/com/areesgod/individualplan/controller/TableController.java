package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.BehaviorData;
import com.areesgod.individualplan.service.TableServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/behaviordata")
@CrossOrigin
public class TableController {
    @Autowired
    private TableServiceImpl tableService;
    @PostMapping("/save")
    public ResponseEntity<BehaviorData> saveBehaviorData(@RequestBody BehaviorData behaviorData){
        return new ResponseEntity<BehaviorData>(tableService.save(behaviorData),HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<BehaviorData>> findAll(){
        return new ResponseEntity<List<BehaviorData>>(tableService.findAll(), HttpStatus.OK);
    }
    @GetMapping("/all/{user_id}")
    public ResponseEntity<List<BehaviorData>> findByUser(@PathVariable Integer user_id) {

        return new ResponseEntity<List<BehaviorData>>(tableService.findbyUserId(user_id), HttpStatus.OK);

    }


    @DeleteMapping("/delete/{user_id}")
    public int deleteUser(@PathVariable Integer user_id) {

        return tableService.deleteByUser(user_id);

    }
}
