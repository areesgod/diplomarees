package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.model.IndividualPlan;
import com.areesgod.individualplan.model.individualplan.EducationalData;
import com.areesgod.individualplan.repository.IndividualPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.areesgod.individualplan.model.IndividualPlan;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/individual/")
public class IndividualPlanController {
    @Autowired
    private IndividualPlanRepository individualPlanRepository;
    @GetMapping("/getAll")
    public List<IndividualPlan> getAllPlans(@RequestParam Integer user_id)
    {
        return individualPlanRepository.findAllBy(user_id);

    }
    @PostMapping("/add")
    public void savePlans(@RequestBody List<EducationalData> plans){
        List<IndividualPlan> individualPlans = new ArrayList<>();
        for (EducationalData educationalData : plans){
            individualPlans.add(dtoToEntity(educationalData));
        }
        Iterable<IndividualPlan> planIterable = individualPlanRepository.saveAll(individualPlans);
    }

}
