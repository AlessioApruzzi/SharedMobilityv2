package com.treeschool.sharedmobility.sharedmobility.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    @NaturalId
    private String taxIdCode;
    @OneToMany
    private Set<DrivingLicenseType> drivingLicenseTypes;
    @OneToMany
    private Set<HelmetType> helmetTypes;
    private double credit;
    @OneToMany
    private List<Vehicle> rentedVehicles;

    public User(String firstName, String lastName, LocalDate dateOfBirth, String taxIdCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.taxIdCode = taxIdCode;
        this.drivingLicenseTypes = new HashSet<>();
        this.helmetTypes = new HashSet<>();
        helmetTypes.add(HelmetType.NONE);
        this.credit = 0.0;
        rentedVehicles = new ArrayList<>();
    }

    public Set<DrivingLicenseType> getDrivingLicenceType() {
        return drivingLicenseTypes;
    }

    public void addDrivingLicense(DrivingLicenseType licenseType) {

        drivingLicenseTypes.add(licenseType);
    }

    public boolean hasDrivingLicense(DrivingLicenseType licenseType) {
        return drivingLicenseTypes.contains(licenseType);
    }

    public void addHelmetType(HelmetType helmetType) {

        this.helmetTypes.add(helmetType);
    }

    public void addCredit(double amount) {
        credit += amount;
    }

    public boolean rentVehicle(Vehicle vehicle) {
        if(vehicle != null) {
            rentedVehicles.add(vehicle);
            return true;
        } else{
            return false;
        }
    }

    public boolean relaseVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            rentedVehicles.remove(vehicle);
            return true;
        } else {
            return false;
        }
    }

}