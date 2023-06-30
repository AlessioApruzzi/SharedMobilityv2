package com.treeschool.sharedmobility.sharedmobility.model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class MotorizedVehicle extends Vehicle {


    private String licencePlate;
    private double fuel;
    private DrivingLicenseType drivingLicenseType;


    public MotorizedVehicle(double rate, String position, String licencePlate) {
        super(rate, position);
        this.licencePlate = licencePlate;
        fuel = 0;
    }

    public void addFuel(double fuel) {
        this.fuel += fuel;
    }

}
