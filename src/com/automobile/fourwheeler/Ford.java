package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    @Override
    public String getModelName() {
        return "Ford EcoSport";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS02AB1234";
    }

    @Override
    public String getOwnerName() {
        return "Ramesh";
    }

    public int speed() {
        return 120;
    }

    public void tempControl() {
        System.out.println("Air Conditioner is ON");
    }
}