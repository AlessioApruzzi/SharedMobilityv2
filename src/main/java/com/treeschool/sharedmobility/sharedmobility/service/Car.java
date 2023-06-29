package com.treeschool.sharedmobility.sharedmobility.service;


public class Car extends MotorizedVehicle {

    public Car(double rate, String position, String drivingPlate) {
        super(rate, position, drivingPlate);
        setDrivingLicenceType(DrivingLicenseType.CAR);
    }
}
