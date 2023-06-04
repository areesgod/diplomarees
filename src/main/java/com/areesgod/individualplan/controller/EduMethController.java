package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.EduMeth;
import com.areesgod.individualplan.service.EduMethService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/edumeth")
@CrossOrigin
public class EduMethController {
    @Autowired
    private EduMethService eduMethService;
    @PostMapping("/add")
    public String add(@RequestBody EduMeth eduMeth){
        eduMethService.saveEduMeth(eduMeth);
        return "New table added";
    }
    @GetMapping("/getAll")
    public List<EduMeth> list(){
        return eduMethService.getAllEduMeth();
    }

}
