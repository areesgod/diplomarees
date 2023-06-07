package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.model.PublicWorkData;

import java.util.List;
import java.util.Optional;

public interface PublicWorkDataService {
    public PublicWorkData saveData(PublicWorkData publicWorkData);
    public List<PublicWorkData> getAllData();
    public Optional<PublicWorkData> getById(Integer id);
    public void deleteById(Integer id);
}
