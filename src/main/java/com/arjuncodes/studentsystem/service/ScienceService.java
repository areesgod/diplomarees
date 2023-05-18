package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.Science;

import java.util.List;

public interface ScienceService {
    public Science saveScience(Science science);
    public List<Science> getAllScience();
}
