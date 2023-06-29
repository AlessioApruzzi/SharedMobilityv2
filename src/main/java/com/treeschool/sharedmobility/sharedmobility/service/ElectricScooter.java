package com.treeschool.sharedmobility.sharedmobility.service;

import lombok.Getter;

@Getter
public class ElectricScooter extends Vehicle {

    double batteryCapacity;

    public ElectricScooter(double rate, String position) {
        super(rate, position);
        this.batteryCapacity = 0;
    }


    public void addBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity += batteryCapacity;
        if(batteryCapacity > 100){
            batteryCapacity = 100;
        }
    }
}

