package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.BehaviorData;
import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.repository.EducationDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EducationDataServiceImpl{
    @Autowired
    private EducationDataRepository educationDataRepository;
    @Transactional
    public List<EducationData> findAll(){
        return educationDataRepository.findAll();
    }
    @Transactional
    public List<EducationData> findbyUserId(Integer id){
        return educationDataRepository.findbyUserId(id);
    }
    @Transactional
    public EducationData save(EducationData educationData){return educationDataRepository.save(educationData);}
    @Transactional
    public Integer deleteByUser(Integer id) {return educationDataRepository.deleteAllByUser(id);}
}
