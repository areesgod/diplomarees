package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.EducationTable;
import com.areesgod.individualplan.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/education")
@CrossOrigin
public class EducationController {
    @Autowired
    private EducationService educationService;

    @PostMapping("/add")
    public String add(@RequestBody EducationTable educationalTable){
        educationService.saveEducationalTable(educationalTable);
        return "New table added";
    }
    @GetMapping("/getAll")
    public List<EducationTable> list(){
        return educationService.getAllEducation();
    }
}
