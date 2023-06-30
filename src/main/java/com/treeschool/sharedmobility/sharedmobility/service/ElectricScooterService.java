package com.treeschool.sharedmobility.sharedmobility.service;

import com.treeschool.sharedmobility.sharedmobility.model.ElectricScooter;
import com.treeschool.sharedmobility.sharedmobility.repository.ElectricScooterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class ElectricScooterService {
    
    @Autowired
    private ElectricScooterRepository esRep;
    
    public ElectricScooter save(ElectricScooter es){
        return esRep.save(es);
    }

    public ElectricScooter update(ElectricScooter es){
       ElectricScooter e = esRep.findById(es.getId()).orElse(null);
        if (e != null) {
            esRep.save(e);
        }
        return e;
    }

    public void deleteByID(Long id){
        esRep.deleteById(id);
    }

    public Optional<ElectricScooter> findByID(Long id){
        if(id == 0)
            return Optional.empty();
        return esRep.findById(id);
    }

    public List<ElectricScooter> findAll(){
        return esRep.findAll();
    }
}