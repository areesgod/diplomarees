package com.arjuncodes.studentsystem.repository;

import com.arjuncodes.studentsystem.model.EduMeth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduMethRepository extends JpaRepository<EduMeth,Integer> {
}
