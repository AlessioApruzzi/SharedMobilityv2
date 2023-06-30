package com.treeschool.sharedmobility.sharedmobility.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Van extends MotorizedVehicle {

    public Van(double rate, String position, String drivingPlate) {
        super(rate, position,drivingPlate);
        this.setDrivingLicenseType(DrivingLicenseType.VAN);
    }
}
