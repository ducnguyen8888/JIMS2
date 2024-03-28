package com.example.jims2.serivce;

import com.example.jims2.entity.JjsMsJuvenileEntity;

import java.util.List;
import java.util.Optional;

public interface JuvenileService {
    List<JjsMsJuvenileEntity> findAll();
    Optional<JjsMsJuvenileEntity> findById(Integer id);
    Optional<JjsMsJuvenileEntity>findByJuvenileNum(Integer juvenileNum);
    List<JjsMsJuvenileEntity>findByJuvenileFirstName(String firstName);
    List<JjsMsJuvenileEntity>findByJuvenileLastName(String lastName);
    List<JjsMsJuvenileEntity>findByJuvenileName(String firstName, Optional<String> LastName);
    Optional<JjsMsJuvenileEntity>findByJuvenileSsn(String ssn);
}
