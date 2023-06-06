package com.areesgod.individualplan.service;
import com.areesgod.individualplan.model.EducationTable;

import java.util.List;
import java.util.Optional;

public interface EducationService {
    public EducationTable saveEducationalTable(EducationTable educationalTable);
    public List<EducationTable> getAllEducation();

    public Optional<EducationTable> getEduById(Integer id);
    public void deleteById(Integer id);
}
