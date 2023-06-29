package com.treeschool.sharedmobility.sharedmobility.service;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Scooter extends MotorizedVehicle {

    public Scooter(double rate, String position, String drivingPlate) {
        super(rate, position, drivingPlate);
        setDrivingLicenseType(DrivingLicenseType.SCOOTER);
        setHelmetType(HelmetType.FULL_FACE);
    }

}