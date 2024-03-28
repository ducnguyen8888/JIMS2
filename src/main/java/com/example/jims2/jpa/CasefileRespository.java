package com.example.jims2.jpa;

import com.example.jims2.entity.JccasefileEntity;
import com.example.jims2.serivce.CasefileService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CasefileRespository extends JpaRepository<JccasefileEntity, Integer> {

    List<JccasefileEntity> findJccasefileEntityByJuvenileId(String juvenileNum);
}
