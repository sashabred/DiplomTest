package com.example.test.authorization.repository;

import com.example.test.authorization.model.ERole;
import com.example.test.authorization.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long>{
    Optional<Role> findByName(ERole name);
}
