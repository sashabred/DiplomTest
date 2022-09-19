package com.example.test.authorization.repository;

import com.example.test.authorization.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo  extends JpaRepository<User, Long> {
        Optional<User> findByEmail(String email);
        Boolean existsByEmail(String email);

    }