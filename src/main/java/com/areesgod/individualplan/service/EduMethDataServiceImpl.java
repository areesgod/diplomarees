package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.EduMethData;
import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.repository.EduMethDataRepository;
import com.areesgod.individualplan.repository.EducationDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EduMethDataServiceImpl{
    @Autowired
    private EduMethDataRepository eduMethDataRepository;
    @Transactional
    public List<EduMethData> findAll(){
        return eduMethDataRepository.findAll();
    }
    @Transactional
    public List<EduMethData> findbyUserId(Integer id){
        return eduMethDataRepository.findbyUserId(id);
    }
    @Transactional
    public EduMethData save(EduMethData educationData){return eduMethDataRepository.save(educationData);}
    @Transactional
    public Integer deleteByUser(Integer id) {return eduMethDataRepository.deleteAllByUser(id);}
}
