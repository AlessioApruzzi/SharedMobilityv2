package com.treeschool.sharedmobility.sharedmobility.service;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Car extends MotorizedVehicle {

    public Car(double rate, String position, String drivingPlate) {
        super(rate, position, drivingPlate);
        setDrivingLicenseType(DrivingLicenseType.CAR);
    }
}
