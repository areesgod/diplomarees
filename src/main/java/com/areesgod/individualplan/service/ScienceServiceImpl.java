package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.Science;
import com.areesgod.individualplan.repository.ScienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<Science> getSciById(Integer id){
        return scienceRepository.findById(id);
    }
    @Override
    public void deleteById(Integer id){scienceRepository.deleteById(id);}
}
