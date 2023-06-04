package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.Science;

import java.util.List;

public interface ScienceService {
    public Science saveScience(Science science);
    public List<Science> getAllScience();
}
