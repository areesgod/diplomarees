package com.arjuncodes.studentsystem.service;
import com.arjuncodes.studentsystem.model.EducationTable;
import com.arjuncodes.studentsystem.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
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
