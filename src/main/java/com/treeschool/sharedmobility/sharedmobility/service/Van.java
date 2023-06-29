package com.treeschool.sharedmobility.sharedmobility.service;


public class Van extends MotorizedVehicle {


    public Van(double rate, String position, String drivingPlate) {
        super(rate, position,drivingPlate);
        this.setDrivingLicenceType(DrivingLicenseType.VAN);
    }
}
