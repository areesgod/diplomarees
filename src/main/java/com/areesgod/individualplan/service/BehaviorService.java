package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.Behavior;

import java.util.List;
import java.util.Optional;

public interface BehaviorService {
    public Behavior saveBehavior(Behavior behavior);
    public List<Behavior> getAllBehavior();

    public Optional<Behavior> getBehById(Integer id);

    public void deleteById(Integer id);
}
