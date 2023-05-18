package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Behavior;

import java.util.List;

public interface BehaviorService {
    public Behavior saveBehavior(Behavior behavior);
    public List<Behavior> getAllBehavior();
}
