package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.KPI;

import java.util.List;
import java.util.Optional;

public interface KPIService {
    public KPI saveKPI(KPI kpi);
    public List<KPI> getAllKPI();
    public Optional<KPI> getKPIById(Integer id);

    public void deleteById(Integer id);

}
