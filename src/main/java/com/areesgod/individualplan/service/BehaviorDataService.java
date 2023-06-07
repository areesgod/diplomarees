package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.BehaviorData;

import java.util.List;
import java.util.Optional;

public interface BehaviorDataService {
    public BehaviorData saveData(BehaviorData behaviorData);
    public List<BehaviorData> getAllBehaviorData();
    public Optional<BehaviorData> getById(Integer id);
    public void deleteById(Integer id);
}
