package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.Behavior;
import com.areesgod.individualplan.repository.BehaviorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class BehaviorServiceImpl implements BehaviorService{
    @Autowired
    private BehaviorRepository behaviorRepository;

    @Override
    public Behavior saveBehavior(Behavior behavior){
        return behaviorRepository.save(behavior);
    }
    public List<Behavior> getAllBehavior(){
        return behaviorRepository.findAll();
    }
    @Override
    public Optional<Behavior> getBehById(Integer id){
        return behaviorRepository.findById(id);
    }
    @Override
    public void deleteById(Integer id){behaviorRepository.deleteById(id);}

}
