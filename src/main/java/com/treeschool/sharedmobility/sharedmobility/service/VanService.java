package com.treeschool.sharedmobility.sharedmobility.service;

import com.treeschool.sharedmobility.sharedmobility.model.Van;
import com.treeschool.sharedmobility.sharedmobility.repository.VanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VanService {
    
    @Autowired
    private VanRepository vanRep;
    
    public Van save(Van van){
        return vanRep.save(van);
    }

    public Van update(Van van){
        Van v = vanRep.findById(van.getId()).orElse(null);
        if (v != null) {
            vanRep.save(v);
        }
        return v;
    }

    public void deleteByID(Long id){
        vanRep.deleteById(id);
    }

    public Optional<Van> findByID(Long id){
        if(id == 0)
            return Optional.empty();
        return vanRep.findById(id);
    }

    public List<Van> findAll(){
        return vanRep.findAll();
    }
}