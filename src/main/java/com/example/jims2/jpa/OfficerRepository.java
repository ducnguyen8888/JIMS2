package com.example.jims2.jpa;

import com.example.jims2.entity.OfficerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficerRepository extends JpaRepository<OfficerEntity, Integer> {
}
