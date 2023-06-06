package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.KPI;
import com.areesgod.individualplan.repository.KPIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KPIServiceImpl implements KPIService{
    @Autowired
    private KPIRepository kpiRepository;

    @Override
    public KPI saveKPI(KPI kpi){return kpiRepository.save(kpi);}
    @Override
    public List<KPI> getAllKPI(){return kpiRepository.findAll();}
    @Override
    public Optional<KPI> getKPIById(Integer id){return kpiRepository.findById(id);}
    @Override
    public void deleteById(Integer id){kpiRepository.deleteById(id);}


}
