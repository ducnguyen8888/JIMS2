package com.example.jims2.serivce;

import com.example.jims2.entity.OfficerEntity;
import com.example.jims2.jpa.OfficerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OfficerServiceImpl implements OfficerService{

    private OfficerRepository officerRepository;

    @Autowired
    public OfficerServiceImpl(OfficerRepository officerRepository){
        this.officerRepository = officerRepository;
    }

    @Override
    public Optional<OfficerEntity> findById(int id ){
        Optional<OfficerEntity> officer = officerRepository.findById( id );
        return officer;
    }

}
