package com.treeschool.sharedmobility.sharedmobility.service;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public abstract class Vehicle {

    @Id
    @GeneratedValue
    private Long id;

    private double rate;
    private boolean booked;
    private String position;
    private HelmetType helmetType;

    public Vehicle(double rate, String position) {
        this.rate = rate;
        this.position = position;
        booked = false;
        helmetType = HelmetType.NONE;
    }

}
