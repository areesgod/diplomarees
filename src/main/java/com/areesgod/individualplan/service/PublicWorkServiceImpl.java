package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.PublicWork;
import com.areesgod.individualplan.repository.PublicWorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    @Override
    public Optional<PublicWork> getPublicById(Integer id){
        return publicWorkRepository.findById(id);
    }
    @Override
    public void deleteById(Integer id){
        publicWorkRepository.deleteById(id);
    }
}
