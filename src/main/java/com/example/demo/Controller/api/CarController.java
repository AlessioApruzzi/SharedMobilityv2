package com.example.demo.Controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.treeschool.sharedmobility.sharedmobility.model.Car;
import com.treeschool.sharedmobility.sharedmobility.service.CarService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class CarController {

    @Autowired
    CarService carService;

    final String versionV1 = "v1";
    final String versionV2 = "v2";


    @GetMapping(versionV1 + "/car")
    public ResponseEntity<List<Car>> getAllCars(){

        List<Car> result = carService.findAll();

        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    @GetMapping(versionV1 + "/bikke/{id}")
    public ResponseEntity<Optional<Car>> getCarByID(@PathVariable Long id){

        Optional<Car> result = carService.findByID(id);

        if(result.isEmpty())
            //null potrei mapparlo con classe wrapper (POJO)
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    @PostMapping(versionV1 + "/car")
    public ResponseEntity<Car> createCitta(@RequestBody Car newCar){

        Car carSaved = carService.save(newCar);

        return new ResponseEntity<>(carSaved, HttpStatus.OK);
    }

    @PutMapping(versionV1 + "/car")
    public ResponseEntity<Car> updateCar(@RequestBody Car updateCar){

        Car carUpdated = carService.update(updateCar);

        return new ResponseEntity<>(carUpdated, HttpStatus.OK);
    }

    @DeleteMapping(versionV1 + "/car/{id}")
    public ResponseEntity<Car> deleteCar(@PathVariable Long id){

        carService.deleteByID(id);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}