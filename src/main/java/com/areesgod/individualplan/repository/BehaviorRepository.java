package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.Behavior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BehaviorRepository extends JpaRepository<Behavior,Integer> {
}
