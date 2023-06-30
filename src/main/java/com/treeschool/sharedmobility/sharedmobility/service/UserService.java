package com.treeschool.sharedmobility.sharedmobility.service;

import com.treeschool.sharedmobility.sharedmobility.model.User;
import com.treeschool.sharedmobility.sharedmobility.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRep;
    
    public User save(User user){
        return userRep.save(user);
    }

    public User update(User user){
        User u = userRep.findById(user.getId()).orElse(null);
        if (u != null) {
            userRep.save(u);
        }
        return u;
    }

    public void deleteByID(Long id){
        userRep.deleteById(id);
    }

    public Optional<User> findByID(Long id){
        if(id == 0)
            return Optional.empty();
        return userRep.findById(id);
    }

    public List<User> findAll(){
        return userRep.findAll();
    }
}