package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.EducationTable;
import com.areesgod.individualplan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EducationRepository extends JpaRepository<EducationTable,Integer> {
    Optional<EducationTable> findByLabel(String label);

    Boolean existsByLabel(String label);

    Boolean existsByDis(String dis);
}
