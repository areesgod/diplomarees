package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.Science;
import com.areesgod.individualplan.service.ScienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/science")
@CrossOrigin
public class ScienceController {
    @Autowired
    private ScienceService scienceService;
    @PostMapping("/add")
    public String add(@RequestBody Science science){
        scienceService.saveScience(science);
        return "New table added";
    }
    @GetMapping("/getAll")
    public List<Science> list(){
        return scienceService.getAllScience();
    }
}
