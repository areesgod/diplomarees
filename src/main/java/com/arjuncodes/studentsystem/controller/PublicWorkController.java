package com.arjuncodes.studentsystem.controller;

import com.arjuncodes.studentsystem.model.PublicWork;
import com.arjuncodes.studentsystem.service.PublicWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publicwork")
@CrossOrigin
public class PublicWorkController {
    @Autowired
    private PublicWorkService publicWorkService;
    @PostMapping("/add")
    public String add(@RequestBody PublicWork publicWork){
        publicWorkService.savePublicWork(publicWork);
        return "New table added";
    }
    @GetMapping("/getAll")
    public List<PublicWork> list(){
        return publicWorkService.getAllPublicWork();
    }
}
