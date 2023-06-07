package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.EducationData;
import com.areesgod.individualplan.model.PublicWorkData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PublicWorkDataRepository extends JpaRepository<PublicWorkData,Integer> {
    @Query(value = "SELECT t FROM PublicWorkData t")
    List<PublicWorkData> findAll();
    @Query("SELECT t FROM PublicWorkData t WHERE t.user_id =?1")
    List<PublicWorkData> findbyUserId(Integer user_id);
    @Modifying
    @Query("DELETE FROM PublicWorkData t WHERE t.user_id =?1")
    int deleteAllByUser(@Param("user_id") Integer user_id);
}
