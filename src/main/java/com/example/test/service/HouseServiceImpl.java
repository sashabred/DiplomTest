package com.example.test.service;

import com.example.test.model.House;
import com.example.test.repository.HouseRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


    @Service
    @RequiredArgsConstructor
    @Transactional
    @Slf4j
    public class HouseServiceImpl implements DataService {

        private final HouseRepo houseRepo;


        @Override
        public Object save(Object o) {
            return houseRepo.save((House) o);
        }

        @Override
        public List<House> getAll() {
            return houseRepo.findAll();
        }
    }
