package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.EducationTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<EducationTable,Integer> {
}
