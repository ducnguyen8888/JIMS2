package com.example.jims2.serivce;

import com.example.jims2.entity.JccasefileEntity;
import com.example.jims2.jpa.CasefileRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CasefileServiceImpl implements CasefileService {

    private CasefileRespository casefileRespository;

    @Autowired
    public CasefileServiceImpl(CasefileRespository casefileRespository){
        this.casefileRespository = casefileRespository;
    }

    @Override
    public Optional<JccasefileEntity> findById(Integer id) {
        Optional<JccasefileEntity>casefile = casefileRespository.findById(id);
        return casefile;
    }

    @Override
    public List<JccasefileEntity> findByJuvenileId(String juvenileNumber){
        List<JccasefileEntity> casefiles = casefileRespository.findJccasefileEntityByJuvenileId(juvenileNumber);
        return casefiles;
    }
}
