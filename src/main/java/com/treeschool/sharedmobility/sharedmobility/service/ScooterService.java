package com.treeschool.sharedmobility.sharedmobility.service;

import com.treeschool.sharedmobility.sharedmobility.model.Scooter;
import com.treeschool.sharedmobility.sharedmobility.repository.ScooterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScooterService {
    
    @Autowired
    private ScooterRepository scooterRep;
    
    public Scooter save(Scooter scooter){
        return scooterRep.save(scooter);
    }

    public Scooter update(Scooter scooter){
        Scooter s = scooterRep.findById(scooter.getId()).orElse(null);
        if (s != null) {
            scooterRep.save(s);
        }
        return s;
    }

    public void deleteByID(Long id){
        scooterRep.deleteById(id);
    }

    public Optional<Scooter> findByID(Long id){
        if(id == 0)
            return Optional.empty();
        return scooterRep.findById(id);
    }

    public List<Scooter> findAll(){
        return scooterRep.findAll();
    }
}