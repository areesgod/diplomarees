package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.Behavior;

import java.util.List;

public interface BehaviorService {
    public Behavior saveBehavior(Behavior behavior);
    public List<Behavior> getAllBehavior();
}
