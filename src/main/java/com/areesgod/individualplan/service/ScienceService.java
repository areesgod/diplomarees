package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.Science;

import java.util.List;
import java.util.Optional;

public interface ScienceService {
    public Science saveScience(Science science);
    public List<Science> getAllScience();

    public Optional<Science> getSciById(Integer id);

    public void deleteById(Integer id);
}
