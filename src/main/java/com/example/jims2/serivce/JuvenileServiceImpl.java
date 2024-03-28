package com.example.jims2.serivce;

import com.example.jims2.entity.JjsMsJuvenileEntity;
import com.example.jims2.jpa.JuvenileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JuvenileServiceImpl implements JuvenileService{
    private JuvenileRepository juvenileRepository;

    @Autowired
    public JuvenileServiceImpl( JuvenileRepository juvenileRepository ){
        this.juvenileRepository = juvenileRepository;
    }

    @Override
    public List<JjsMsJuvenileEntity> findAll(){
        List<JjsMsJuvenileEntity> juveniles = juvenileRepository.findAll();
        return juveniles;
    }


    @Override
    public Optional<JjsMsJuvenileEntity> findById(Integer id){
        Optional<JjsMsJuvenileEntity> juvenile = juvenileRepository.findById(id);
        return juvenile;
    }

    @Override
    public Optional<JjsMsJuvenileEntity>findByJuvenileNum(Integer juvenileNum){
        Optional<JjsMsJuvenileEntity>juvenile = juvenileRepository.findByJuvenilenum(juvenileNum);
        return juvenile;
    }

    @Override
    public List<JjsMsJuvenileEntity>findByJuvenileFirstName(String firstName){
        List<JjsMsJuvenileEntity>juveniles = juvenileRepository.findByFirstName(firstName);
        return juveniles;
    }

    @Override
    public List<JjsMsJuvenileEntity>findByJuvenileLastName(String lastName){
        List<JjsMsJuvenileEntity>juveniles = juvenileRepository.findByLastName(lastName);
        return juveniles;
    }

    @Override
    public List<JjsMsJuvenileEntity>findByJuvenileName(String firstName, Optional<String> lastName){
        List<JjsMsJuvenileEntity>juveniles = juvenileRepository.findByName(firstName, lastName);
        return juveniles;
    }

    @Override
    public Optional<JjsMsJuvenileEntity>findByJuvenileSsn(String ssn){
        Optional<JjsMsJuvenileEntity>juvenile = juvenileRepository.findByJuvenilessn(ssn);
        return juvenile;
    }

}
