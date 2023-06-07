package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.model.ScienceData;

import java.util.List;
import java.util.Optional;

public interface ScienceDataService {
    public ScienceData saveData(ScienceData scienceData);
    public List<ScienceData > getAllData();
    public Optional<ScienceData > getById(Integer id);
    public void deleteById(Integer id);
}
