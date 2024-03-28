package com.example.jims2.serivce;

import com.example.jims2.entity.OfficerEntity;
import com.example.jims2.jpa.OfficerRepository;

import java.util.Optional;

public interface OfficerService {
    Optional<OfficerEntity> findById(int id );
}
