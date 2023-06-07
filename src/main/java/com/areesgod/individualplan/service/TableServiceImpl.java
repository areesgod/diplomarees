package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.BehaviorData;
import com.areesgod.individualplan.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TableServiceImpl {
    @Autowired
    private TableRepository tableRepository;
    @Transactional
    public List<BehaviorData> findAll(){
        return tableRepository.findAll();
    }
    @Transactional
    public List<BehaviorData> findbyUserId(Integer id){
        return tableRepository.findbyUserId(id);
    }
    @Transactional
    public BehaviorData save(BehaviorData behaviorData){return tableRepository.save(behaviorData);}
    @Transactional
    public Integer deleteByUser(Integer id) {return tableRepository.deleteAllByUser(id);}

}
