package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.PublicWork;
import com.arjuncodes.studentsystem.repository.PublicWorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicWorkServiceImpl implements PublicWorkService{
    @Autowired
    private PublicWorkRepository publicWorkRepository;

    @Override
    public PublicWork savePublicWork(PublicWork publicWork){
        return publicWorkRepository.save(publicWork);
    }
    @Override
    public List<PublicWork>getAllPublicWork(){
        return publicWorkRepository.findAll();
    }
}
