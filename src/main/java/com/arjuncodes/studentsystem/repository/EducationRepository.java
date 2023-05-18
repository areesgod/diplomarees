package com.arjuncodes.studentsystem.repository;

import com.arjuncodes.studentsystem.model.EducationTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<EducationTable,Integer> {
}
