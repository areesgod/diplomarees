package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.EduMethData;
import com.areesgod.individualplan.model.EducationData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EduMethDataRepository extends JpaRepository<EduMethData,Integer> {
    @Query(value = "SELECT t FROM EduMethData t")
    List<EduMethData> findAll();
    @Query("SELECT t FROM EduMethData t WHERE t.user_id =?1")
    List<EduMethData> findbyUserId(Integer user_id);
    @Modifying
    @Query("DELETE FROM EduMethData t WHERE t.user_id =?1")
    int deleteAllByUser(@Param("user_id") Integer user_id);
}
