package com.treeschool.sharedmobility.sharedmobility.service;
import lombok.Getter;

@Getter
public abstract class Vehicle {

    private static int idVehicle = 0;
    private int id;
    private double rate;
    private boolean booked;
    private String position;
    private HelmetType helmetType;

    public Vehicle(double rate, String position) {
        this.rate = rate;
        this.position = position;
        this.id = idVehicle++;
        booked = false;
        helmetType = HelmetType.NONE;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setState(boolean booked) {
        this.booked = booked;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHelmetType(HelmetType helmetType) {
        this.helmetType = helmetType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", rate=" + rate +
                ", booked=" + booked +
                ", position='" + position + '\'' +
                ", helmetType=" + helmetType +
                '}';
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(rate);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + (booked ? 1231 : 1237);
        result = prime * result + ((position == null) ? 0 : position.hashCode());
        result = prime * result + ((helmetType == null) ? 0 : helmetType.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehicle other = (Vehicle) obj;
        if (Double.doubleToLongBits(rate) != Double.doubleToLongBits(other.rate))
            return false;
        if (booked != other.booked)
            return false;
        if (position == null) {
            if (other.position != null)
                return false;
        } else if (!position.equals(other.position))
            return false;
        if (helmetType != other.helmetType)
            return false;
        return true;
    }

    
}
