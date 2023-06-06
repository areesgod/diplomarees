package com.areesgod.individualplan.service;
import com.areesgod.individualplan.model.EduMeth;
import com.areesgod.individualplan.repository.EduMethRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EduMethServiceImpl implements EduMethService {
    @Autowired
    private EduMethRepository eduMethRepository;
    @Override
    public EduMeth saveEduMeth(EduMeth eduMeth){
        return eduMethRepository.save(eduMeth);
    }
    @Override
    public List<EduMeth> getAllEduMeth(){
        return eduMethRepository.findAll();
    }
    @Override
    public Optional<EduMeth> getEduMethById(Integer id){
        return eduMethRepository.findById(id);
    }
    @Override
    public void deleteById(Integer id){eduMethRepository.deleteById(id);}
}
