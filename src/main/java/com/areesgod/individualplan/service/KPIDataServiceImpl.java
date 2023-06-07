package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.model.KPIData;
import com.areesgod.individualplan.repository.EducationDataRepository;
import com.areesgod.individualplan.repository.KPIDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class KPIDataServiceImpl{
    @Autowired
    private KPIDataRepository kpiDataRepository;
    @Transactional
    public List<KPIData> findAll(){
        return kpiDataRepository.findAll();
    }
    @Transactional
    public List<KPIData> findbyUserId(Integer id){
        return kpiDataRepository.findbyUserId(id);
    }
    @Transactional
    public KPIData save(KPIData kpiData){return kpiDataRepository.save(kpiData);}
    @Transactional
    public Integer deleteByUser(Integer id) {return kpiDataRepository.deleteAllByUser(id);}
}
