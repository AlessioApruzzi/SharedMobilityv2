package com.treeschool.sharedmobility.sharedmobility.service;

import com.treeschool.sharedmobility.sharedmobility.model.Bike;
import com.treeschool.sharedmobility.sharedmobility.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BikeService {
    
    @Autowired
    private BikeRepository bikeRep;
    
    public Bike save(Bike bike){
        return bikeRep.save(bike);
    }

    public Bike update(Bike bike){
        Bike b = bikeRep.findById(bike.getId()).orElse(null);
        if (b != null) {
            bikeRep.save(b);
        }
        return b;
    }

    public void deleteByID(Long id){
        bikeRep.deleteById(id);
    }

    public Optional<Bike> findByID(Long id){
        if(id == 0)
            return Optional.empty();
        return bikeRep.findById(id);
    }

    public List<Bike> findAll(){
        return bikeRep.findAll();
    }
}