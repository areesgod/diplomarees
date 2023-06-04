package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.EduMeth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EduMethRepository extends JpaRepository<EduMeth,Integer> {
}
