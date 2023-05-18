package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Behavior;
import com.arjuncodes.studentsystem.repository.BehaviorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
