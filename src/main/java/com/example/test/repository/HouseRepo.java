package com.example.test.repository;

import com.example.test.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HouseRepo  extends JpaRepository<House, Long> {}