package com.example.jims2.rest;

import com.example.jims2.entity.JccasefileEntity;
import com.example.jims2.serivce.CasefileService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CasefileRestController {
    private CasefileService casefileService;

    @Autowired
    public CasefileRestController(CasefileService casefileService){
        this.casefileService = casefileService;
    }

    @GetMapping("/casefiles/id/{casefileId}")
    public Optional<JccasefileEntity>getCasefileById(@PathVariable  int casefileId){
        Optional<JccasefileEntity>casefile = casefileService.findById( casefileId );
        return casefile;
    }

    @GetMapping("/casefiles/juvenileId/{juvenileId}")
    public List<JccasefileEntity> getCasefileByJuvenileId(@PathVariable  String juvenileId){
        List<JccasefileEntity>casefiles = casefileService.findByJuvenileId( juvenileId );
        return casefiles;
    }
}
