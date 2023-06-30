package com.treeschool.sharedmobility.sharedmobility.repository;

import com.treeschool.sharedmobility.sharedmobility.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car,Long>{
    
    
}