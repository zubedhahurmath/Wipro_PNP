package com.automobile;

import com.automobile.twowheeler.Hero;
import com.automobile.twowheeler.Honda;
import com.automobile.fourwheeler.Logan;
import com.automobile.fourwheeler.Ford;

public class TestVehicle {

    public static void main(String[] args) {

        Hero hero = new Hero();
        System.out.println("----- HERO -----");
        System.out.println("Model : " + hero.getModelName());
        System.out.println("Registration : " + hero.getRegistrationNumber());
        System.out.println("Owner : " + hero.getOwnerName());
        System.out.println("Speed : " + hero.getSpeed());
        hero.radio();

        System.out.println();

        Honda honda = new Honda();
        System.out.println("----- HONDA -----");
        System.out.println("Model : " + honda.getModelName());
        System.out.println("Registration : " + honda.getRegistrationNumber());
        System.out.println("Owner : " + honda.getOwnerName());
        System.out.println("Speed : " + honda.getSpeed());
        honda.cdplayer();

        System.out.println();

        Logan logan = new Logan();
        System.out.println("----- LOGAN -----");
        System.out.println("Model : " + logan.getModelName());
        System.out.println("Registration : " + logan.getRegistrationNumber());
        System.out.println("Owner : " + logan.getOwnerName());
        System.out.println("Speed : " + logan.speed());
        logan.gps();

        System.out.println();

        Ford ford = new Ford();
        System.out.println("----- FORD -----");
        System.out.println("Model : " + ford.getModelName());
        System.out.println("Registration : " + ford.getRegistrationNumber());
        System.out.println("Owner : " + ford.getOwnerName());
        System.out.println("Speed : " + ford.speed());
        ford.tempControl();
    }
}