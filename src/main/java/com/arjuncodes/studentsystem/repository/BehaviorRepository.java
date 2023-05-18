package com.arjuncodes.studentsystem.repository;

import com.arjuncodes.studentsystem.model.Behavior;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BehaviorRepository extends JpaRepository<Behavior,Integer> {
}
