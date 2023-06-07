package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.model.KPIData;

import java.util.List;
import java.util.Optional;

public interface KPIDataService {
    public KPIData saveData(KPIData kpiData);
    public List<KPIData> getAllData();
    public Optional<KPIData> getById(Integer id);
    public void deleteById(Integer id);
}
