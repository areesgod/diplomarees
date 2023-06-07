package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.model.KPIData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface KPIDataRepository extends JpaRepository<KPIData,Integer> {
    @Query(value = "SELECT t FROM KPIData t")
    List<KPIData> findAll();
    @Query("SELECT t FROM KPIData t WHERE t.user_id =?1")
    List<KPIData> findbyUserId(Integer user_id);
    @Modifying
    @Query("DELETE FROM KPIData t WHERE t.user_id =?1")
    int deleteAllByUser(@Param("user_id") Integer user_id);
}
