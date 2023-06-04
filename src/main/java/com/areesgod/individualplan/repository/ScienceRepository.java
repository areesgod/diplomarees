package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.Science;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScienceRepository extends JpaRepository<Science,Integer> {
}
