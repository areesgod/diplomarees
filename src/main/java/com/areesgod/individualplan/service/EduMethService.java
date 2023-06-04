package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.EduMeth;


import java.util.List;

public interface EduMethService {
    public EduMeth saveEduMeth(EduMeth eduMeth);
    public List<EduMeth> getAllEduMeth();
}
