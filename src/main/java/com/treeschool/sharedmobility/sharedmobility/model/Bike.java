package com.treeschool.sharedmobility.sharedmobility.model;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Bike extends Vehicle {

    public Bike(double rate, String position) {
        super(rate, position);
        setHelmetType(HelmetType.STANDARD);
    }


}
