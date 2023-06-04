package com.areesgod.individualplan.service;
import com.areesgod.individualplan.model.EducationTable;
import com.areesgod.individualplan.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class EducationServiceImpl implements EducationService {
    @Autowired
    private EducationRepository educationalRepository;
    @Override
    public EducationTable saveEducationalTable(EducationTable educationalTable) {
        return educationalRepository.save(educationalTable);
    }
    @Override
    public List<EducationTable> getAllEducation() {
        return educationalRepository.findAll();
    }
}
