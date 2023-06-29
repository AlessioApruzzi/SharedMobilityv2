package com.treeschool.sharedmobility.sharedmobility.service;

import lombok.Getter;

@Getter
public class Scooter extends MotorizedVehicle {


    public Scooter(double rate, String position, String drivingPlate) {
        super(rate, position, drivingPlate);
        setDrivingLicenceType(DrivingLicenseType.SCOOTER);
        setHelmetType(HelmetType.FULL_FACE);
    }

}