package com.treeschool.sharedmobility.sharedmobility.service;

import com.treeschool.sharedmobility.sharedmobility.model.Car;
import com.treeschool.sharedmobility.sharedmobility.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    
    @Autowired
    private CarRepository carRep;
    
    public Car save(Car car){
        return carRep.save(car);
    }

    public Car update(Car car){
        Car c = carRep.findById(car.getId()).orElse(null);
        if (c != null) {
            carRep.save(c);
        }
        return c;
    }

    public void deleteByID(Long id){
        carRep.deleteById(id);
    }

    public Optional<Car> findByID(Long id){
        if(id == 0)
            return Optional.empty();
        return carRep.findById(id);
    }

    public List<Car> findAll(){
        return carRep.findAll();
    }
}