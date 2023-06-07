package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.BehaviorData;
import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.repository.BehaviorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BehaviorDataServiceImpl implements BehaviorDataService{
    @Autowired
    private BehaviorDataRepository behaviorDataRepository;
    @Override
    public BehaviorData saveData(BehaviorData behaviorData){
        return behaviorDataRepository.save(behaviorData);
    }
    @Override
    public List<BehaviorData> getAllBehaviorData(){return behaviorDataRepository.findAll();}
    @Override
    public Optional<BehaviorData> getById(Integer id){return behaviorDataRepository.findById(id);}
    @Override
    public void deleteById(Integer id){behaviorDataRepository.deleteById(id);}

}
