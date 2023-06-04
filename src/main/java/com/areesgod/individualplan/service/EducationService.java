package com.areesgod.individualplan.service;
import com.areesgod.individualplan.model.EducationTable;

import java.util.List;

public interface EducationService {
    public EducationTable saveEducationalTable(EducationTable educationalTable);
    public List<EducationTable> getAllEducation();
}
