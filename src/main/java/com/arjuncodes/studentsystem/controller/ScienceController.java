package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.EduMeth;
import com.arjuncodes.studentsystem.model.Science;
import com.arjuncodes.studentsystem.service.ScienceService;
import com.arjuncodes.studentsystem.service.ScienceServiceImpl;
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
