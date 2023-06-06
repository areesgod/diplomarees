package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.KPI;
import com.areesgod.individualplan.service.KPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.image.RescaleOp;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/kpi")
@CrossOrigin
public class KPIController {
    @Autowired
    private KPIService kpiService;
    @PostMapping("/add")
    public int add(@RequestBody KPI kpi){
        kpiService.saveKPI(kpi);
        return kpi.getId();
    }
    @GetMapping("/getAll")
    public List<KPI> list(){
        return kpiService.getAllKPI();
    }
    @GetMapping("/getby/{id}")
        public ResponseEntity<KPI> getKPIById(@PathVariable Integer id){
            Optional<KPI> kpiData = kpiService.getKPIById(id);
            if(kpiData.isPresent()){
                return new ResponseEntity<>(kpiData.get(), HttpStatus.OK);
            }
            else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteKPI(@PathVariable("id") Integer id){
        try {
            kpiService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    }

