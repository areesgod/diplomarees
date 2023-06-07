package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.model.ScienceData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ScienceDataRepository extends JpaRepository<ScienceData,Integer> {
    @Query(value = "SELECT t FROM ScienceData t")
    List<ScienceData> findAll();
    @Query("SELECT t FROM ScienceData t WHERE t.user_id =?1")
    List<ScienceData> findbyUserId(Integer user_id);
    @Modifying
    @Query("DELETE FROM ScienceData t WHERE t.user_id =?1")
    int deleteAllByUser(@Param("user_id") Integer user_id);
}
