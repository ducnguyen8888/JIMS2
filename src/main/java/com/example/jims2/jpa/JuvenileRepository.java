package com.example.jims2.jpa;

import com.example.jims2.entity.JjsMsJuvenileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface JuvenileRepository extends JpaRepository<JjsMsJuvenileEntity, Integer> {

    Optional<JjsMsJuvenileEntity> findByJuvenilenum(Integer juvenileNum);
    @Query(value = "SELECT * FROM jims2.JJS_MS_JUVENILE  WHERE ?1 is null or JUVENILEFNAME = ?1", nativeQuery = true)
    List<JjsMsJuvenileEntity> findByFirstName(String firstName);
    @Query("select j from JjsMsJuvenileEntity j where ?1 is null or j.juvenilelname=?1")
    List<JjsMsJuvenileEntity>findByLastName(String lastName);
    @Query("select j from JjsMsJuvenileEntity  j WHERE j.juvenilefname=?1 and (?2 is null  or j.juvenilelname = ?2)")
    List<JjsMsJuvenileEntity>findByName(String firstName, Optional<String> lastName);
    Optional<JjsMsJuvenileEntity> findByJuvenilessn(String ssn);
}
