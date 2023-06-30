package com.treeschool.sharedmobility.sharedmobility.repository;

import com.treeschool.sharedmobility.sharedmobility.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long>{

    
    
}