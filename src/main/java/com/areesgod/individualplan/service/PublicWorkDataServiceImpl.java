package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.model.PublicWorkData;
import com.areesgod.individualplan.repository.EducationDataRepository;
import com.areesgod.individualplan.repository.PublicWorkDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PublicWorkDataServiceImpl{
    @Autowired
    private PublicWorkDataRepository publicWorkDataRepository;
    @Transactional
    public List<PublicWorkData> findAll(){
        return publicWorkDataRepository.findAll();
    }
    @Transactional
    public List<PublicWorkData> findbyUserId(Integer id){
        return publicWorkDataRepository.findbyUserId(id);
    }
    @Transactional
    public PublicWorkData save(PublicWorkData publicWorkData){return publicWorkDataRepository.save(publicWorkData);}
    @Transactional
    public Integer deleteByUser(Integer id) {return publicWorkDataRepository.deleteAllByUser(id);}
}
