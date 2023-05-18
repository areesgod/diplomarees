package com.arjuncodes.studentsystem.repository;

import com.arjuncodes.studentsystem.model.Science;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScienceRepository extends JpaRepository<Science,Integer> {
}
