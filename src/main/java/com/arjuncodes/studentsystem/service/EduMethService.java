package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.EduMeth;
import org.springframework.stereotype.Service;


import java.util.List;

public interface EduMethService {
    public EduMeth saveEduMeth(EduMeth eduMeth);
    public List<EduMeth> getAllEduMeth();
}
