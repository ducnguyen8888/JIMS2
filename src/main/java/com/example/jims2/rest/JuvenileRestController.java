package com.example.jims2.rest;

import com.example.jims2.entity.JjsMsJuvenileEntity;
import com.example.jims2.serivce.JuvenileService;
import com.example.jims2.serivce.JuvenileServiceImpl;
import org.hibernate.annotations.IdGeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class JuvenileRestController {
    private JuvenileService juvenileService;

    @Autowired
    public JuvenileRestController(JuvenileService juvenileService){
        this.juvenileService = juvenileService;
    }

    @GetMapping("/juveniles")
    public List<JjsMsJuvenileEntity>getJuveniles(){
        List<JjsMsJuvenileEntity> juveniles = juvenileService.findAll();
        return juveniles;
    }

    @GetMapping("/juveniles/id/{juvenileId}")
    public Optional<JjsMsJuvenileEntity> getJuvenileById(@PathVariable int juvenileId){
        Optional<JjsMsJuvenileEntity> juvenile = juvenileService.findById(juvenileId);
        return juvenile;
    }

    @GetMapping("/juveniles/juvenileNum/{juvenileNum}")
    public Optional<JjsMsJuvenileEntity>getJuvenileByJuvenileNum(@PathVariable int juvenileNum){
        Optional<JjsMsJuvenileEntity> juvenile = juvenileService.findByJuvenileNum(juvenileNum);
        return juvenile;
    }

    @GetMapping("/juveniles/juvenileFirstName/{firstName}")
    public List<JjsMsJuvenileEntity>getJuvenileByFirstName(@PathVariable String firstName){
        List<JjsMsJuvenileEntity>juveniles = juvenileService.findByJuvenileFirstName(firstName);
        return juveniles;
    }

    @GetMapping("/juveniles/juvenileLastName/{lastName}")
    public List<JjsMsJuvenileEntity>getJuvenilesByLastName(@PathVariable String lastName){
        List<JjsMsJuvenileEntity>juveniles = juvenileService.findByJuvenileLastName(lastName);
        return juveniles;
    }

    @GetMapping(value = {"/juveniles/juvenileName/{firstName}", "/juveniles/juvenileName/{firstName}/{lastName}"})
    public List<JjsMsJuvenileEntity>getJuvenileByName(@PathVariable String firstName, @PathVariable Optional<String> lastName){
        List<JjsMsJuvenileEntity>juveniles = juvenileService.findByJuvenileName(firstName, lastName);

        return juveniles;
    }

    @GetMapping("/juveniles/juvenileSsn/{ssn}")
    public Optional<JjsMsJuvenileEntity>getJuvenileBySsn(@PathVariable String ssn){
        Optional<JjsMsJuvenileEntity>juvenile = juvenileService.findByJuvenileSsn(ssn);
        return juvenile;
    }
}
