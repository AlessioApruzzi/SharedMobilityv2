package com.treeschool.sharedmobility.sharedmobility.service;

import lombok.Getter;

@Getter
public class Bike extends Vehicle {

    public Bike(double rate, String position) {
        super(rate, position);
        setHelmetType(HelmetType.STANDARD);
    }


}
