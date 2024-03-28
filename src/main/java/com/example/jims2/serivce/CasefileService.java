package com.example.jims2.serivce;

import com.example.jims2.entity.JccasefileEntity;

import java.util.List;
import java.util.Optional;

public interface CasefileService {
    Optional<JccasefileEntity>findById(Integer id);
    List<JccasefileEntity>findByJuvenileId(String juvenileNum);
}
