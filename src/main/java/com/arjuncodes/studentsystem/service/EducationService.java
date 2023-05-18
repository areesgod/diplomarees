package com.arjuncodes.studentsystem.service;
import com.arjuncodes.studentsystem.model.EducationTable;
import org.springframework.stereotype.Service;
import java.util.List;

public interface EducationService {
    public EducationTable saveEducationalTable(EducationTable educationalTable);
    public List<EducationTable> getAllEducation();
}
