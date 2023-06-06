package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.PublicWork;

import java.util.List;
import java.util.Optional;

public interface PublicWorkService {
    public PublicWork savePublicWork(PublicWork publicWork);

    public List<PublicWork> getAllPublicWork();
    public Optional<PublicWork> getPublicById(Integer id);
    public void deleteById(Integer id);
}
