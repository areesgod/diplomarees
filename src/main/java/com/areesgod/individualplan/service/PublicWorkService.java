package com.areesgod.individualplan.service;

import com.areesgod.individualplan.model.PublicWork;

import java.util.List;

public interface PublicWorkService {
    public PublicWork savePublicWork(PublicWork publicWork);

    public List<PublicWork> getAllPublicWork();
}
