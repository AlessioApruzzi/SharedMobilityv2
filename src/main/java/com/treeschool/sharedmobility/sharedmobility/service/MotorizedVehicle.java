package com.treeschool.sharedmobility.sharedmobility.service;

import lombok.Getter;

@Getter
public class MotorizedVehicle extends Vehicle {

    private String licencePlate;
    private double fuel;
    private DrivingLicenseType drivingLicenseType;
    //inserite l'enum della patente e relativi getter/setter


    public MotorizedVehicle(double rate, String position, String licencePlate) {
        super(rate, position);
        this.licencePlate = licencePlate;
        fuel = 0;
    }

    public void setDrivingLicenceType(DrivingLicenseType drivingLicenceType) {
        this.drivingLicenseType = drivingLicenceType;
    }

    public void addFuel(double fuel) {
        this.fuel += fuel;
    }

    @Override
    public String toString() {
        return super.toString() + "MotorizedVehicle{" +
                "licencePlate='" + licencePlate + '\'' +
                ", fuel=" + fuel +
                ", drivingLicenseType=" + drivingLicenseType +
                '}';
    }
}
