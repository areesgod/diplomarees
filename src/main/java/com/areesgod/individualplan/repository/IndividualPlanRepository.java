package com.areesgod.individualplan.repository;

import com.areesgod.individualplan.model.IndividualPlan;
import com.areesgod.individualplan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IndividualPlanRepository extends JpaRepository<IndividualPlan,Integer> {
    Optional<IndividualPlan> findByPlan(String plan);

    Boolean existsByPlan(String plan);
    List<IndividualPlan> findAllBy(final Integer user_id);

}
