package com.arjuncodes.studentsystem.service;
import com.arjuncodes.studentsystem.model.EduMeth;
import com.arjuncodes.studentsystem.repository.EduMethRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
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
}
