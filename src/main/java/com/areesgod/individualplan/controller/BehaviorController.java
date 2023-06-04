package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.Behavior;
import com.areesgod.individualplan.service.BehaviorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/behavior")
@CrossOrigin
public class BehaviorController {
    @Autowired
    private BehaviorService behaviorService;
    @PostMapping("/add")
    public String add(@RequestBody Behavior behavior){
        behaviorService.saveBehavior(behavior);
        return "New table added";
    }
    @GetMapping("/getAll")
    public List<Behavior> list(){
        return behaviorService.getAllBehavior();
    }
}
