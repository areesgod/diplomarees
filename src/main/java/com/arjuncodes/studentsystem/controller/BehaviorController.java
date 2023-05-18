package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.Behavior;
import com.arjuncodes.studentsystem.service.BehaviorService;
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
