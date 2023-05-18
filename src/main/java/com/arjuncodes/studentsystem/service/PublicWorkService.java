package com.arjuncodes.studentsystem.service;

import com.arjuncodes.studentsystem.model.PublicWork;

import java.util.List;

public interface PublicWorkService {
    public PublicWork savePublicWork(PublicWork publicWork);

    public List<PublicWork> getAllPublicWork();
}
