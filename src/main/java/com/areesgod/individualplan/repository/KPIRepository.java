package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.KPI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KPIRepository extends JpaRepository<KPI,Integer> {
}
