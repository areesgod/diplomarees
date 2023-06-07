package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.ScienceData;
import com.areesgod.individualplan.repository.ScienceDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ScienceDataServiceImpl{
    @Autowired
    private ScienceDataRepository scienceDataRepository;
    @Transactional
    public List<ScienceData> findAll(){
        return scienceDataRepository.findAll();
    }
    @Transactional
    public List<ScienceData> findbyUserId(Integer id){
        return scienceDataRepository.findbyUserId(id);
    }
    @Transactional
    public ScienceData save(ScienceData scienceData){return scienceDataRepository.save(scienceData);}
    @Transactional
    public Integer deleteByUser(Integer id) {return scienceDataRepository.deleteAllByUser(id);}
}
