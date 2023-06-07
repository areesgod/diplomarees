package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.EduMethData;
import com.areesgod.individualplan.model.EducationData;

import java.util.List;
import java.util.Optional;

public interface EduMethDataService {
    public EduMethData saveData(EduMethData eduMethData);
    public List<EduMethData> getAllData();
    public Optional<EduMethData> getById(Integer id);
    public void deleteById(Integer id);
}
