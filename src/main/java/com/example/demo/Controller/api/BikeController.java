package com.example.demo.Controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.treeschool.sharedmobility.sharedmobility.model.Bike;
import com.treeschool.sharedmobility.sharedmobility.service.BikeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class BikeController {

    @Autowired
    BikeService bikeService;

    final String versionV1 = "v1";
    final String versionV2 = "v2";


    @GetMapping(versionV1 + "/bikes")
    public ResponseEntity<List<Bike>> getAllBikes(){

        List<Bike> result = bikeService.findAll();

        return new ResponseEntity<>(result, HttpStatus.OK);
    }



    @GetMapping(versionV1 + "/bikke/{id}")
    public ResponseEntity<Optional<Bike>> getBikeByID(@PathVariable Long id){

        Optional<Bike> result = bikeService.findByID(id);

        if(result.isEmpty())
            //null potrei mapparlo con classe wrapper (POJO)
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }


    @PostMapping(versionV1 + "/citta")
    public ResponseEntity<Bike> createBike(@RequestBody Bike newCitta){

        Bike cittaSaved = bikeService.save(newCitta);

        return new ResponseEntity<>(cittaSaved, HttpStatus.OK);
    }

    @PutMapping(versionV1 + "/citta")
    public ResponseEntity<Bike> updateBike(@RequestBody Bike updateBike){

        Bike bikeUpdated = bikeService.update(updateBike);

        return new ResponseEntity<>(bikeUpdated, HttpStatus.OK);
    }

    @DeleteMapping(versionV1 + "/citta/{id}")
    public ResponseEntity<Bike> deleteBike(@PathVariable Long id){

        bikeService.deleteByID(id);

        return new ResponseEntity<>(null, HttpStatus.OK);
    }
}