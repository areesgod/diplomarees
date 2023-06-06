package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.EduMeth;


import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface EduMethService {
    public EduMeth saveEduMeth(EduMeth eduMeth);
    public List<EduMeth> getAllEduMeth();
    public Optional<EduMeth> getEduMethById(Integer id);
    public void deleteById(Integer id);
}
