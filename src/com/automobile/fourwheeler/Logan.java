package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    @Override
    public String getModelName() {
        return "Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP01XY5678";
    }

    @Override
    public String getOwnerName() {
        return "Suresh";
    }

    public int speed() {
        return 100;
    }

    public void gps() {
        System.out.println("GPS is ON");
    }
}