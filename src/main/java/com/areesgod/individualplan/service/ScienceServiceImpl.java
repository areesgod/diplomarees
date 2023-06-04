package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.Science;
import com.areesgod.individualplan.repository.ScienceRepository;
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
