package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.BehaviorData;
import com.areesgod.individualplan.model.EducationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EducationDataRepository extends JpaRepository<EducationData,Integer> {
    @Query(value = "SELECT t FROM EducationData t")
    List<EducationData> findAll();
    @Query("SELECT t FROM EducationData t WHERE t.user_id =?1")
    List<EducationData> findbyUserId(Integer user_id);
    @Modifying
    @Query("DELETE FROM EducationData t WHERE t.user_id =?1")
    int deleteAllByUser(@Param("user_id") Integer user_id);
}
