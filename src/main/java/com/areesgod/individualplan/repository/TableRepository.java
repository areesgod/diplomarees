package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.BehaviorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface TableRepository extends JpaRepository<BehaviorData,Long> {
    @Query(value = "SELECT t FROM BehaviorData t")
    List<BehaviorData> findAll();
    @Query("SELECT t FROM BehaviorData t WHERE t.user_id =?1")
    List<BehaviorData> findbyUserId(Integer user_id);
    @Modifying
    @Query("DELETE FROM BehaviorData t WHERE t.user_id =?1")
    int deleteAllByUser(@Param("user_id") Integer user_id);
}
