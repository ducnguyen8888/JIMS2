package com.example.jims2.rest;

import com.example.jims2.entity.OfficerEntity;
import com.example.jims2.serivce.OfficerService;
import com.example.jims2.serivce.OfficerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class OfficerRestController {
    private OfficerService officerService;


    @Autowired
    public OfficerRestController(OfficerService officerService){
        this.officerService = officerService;
    }

    @GetMapping("/officers/officerId/{officerId}")
    public Optional<OfficerEntity>getOfficerById(@PathVariable  int officerId){
        Optional<OfficerEntity> officer = officerService.findById( officerId );
        return officer;
    }
}
