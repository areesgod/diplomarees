package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Science;
import com.arjuncodes.studentsystem.repository.ScienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScienceServiceImpl implements ScienceService{
    @Autowired
    private ScienceRepository scienceRepository;
    @Override
    public Science saveScience(Science science){
        return scienceRepository.save(science);
    }
    @Override
    public List<Science> getAllScience(){
        return scienceRepository.findAll();
    }
}
