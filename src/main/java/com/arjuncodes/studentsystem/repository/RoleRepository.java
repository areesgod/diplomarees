package com.arjuncodes.studentsystem.repository;

import com.arjuncodes.studentsystem.model.ERole;
import com.arjuncodes.studentsystem.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
