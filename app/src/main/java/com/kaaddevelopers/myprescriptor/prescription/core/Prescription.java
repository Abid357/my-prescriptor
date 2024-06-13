package com.kaaddevelopers.myprescriptor.prescription.core;

import java.util.ArrayList;

/**
 * Created by Abid-Temp on 30-Dec-17.
 */

public class Prescription {
    private String name;
    private String username; // name and username together are the composite primary key
    private int dosage;
    private String dosageType; // mg, ml, etc.
    private char WRT_food; // with Respect To Food - B:before, D:during or A:after food
    private char WRT_sleep; // With Respect To Sleep - B:before or A:after
    private String DOW; // Days Of Week - Sunday through Saturday denoted by: UMTWRFS

    public Prescription(String name, String username, int dosage, String dosageType, char WRT_food, char WRT_sleep, String DOW) {
        this.name = name;
        this.username = username;
        this.dosage = dosage;
        this.dosageType = dosageType;
        this.WRT_food = WRT_food;
        this.WRT_sleep = WRT_sleep;
        this.DOW = DOW;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public String getDosageType() {
        return dosageType;
    }

    public void setDosageType(String dosageType) {
        this.dosageType = dosageType;
    }

    public char getWRT_food() {
        return WRT_food;
    }

    public void setWRT_food(char WRT_food) {
        this.WRT_food = WRT_food;
    }

    public char getWRT_sleep() {
        return WRT_sleep;
    }

    public void setWRT_sleep(char WRT_sleep) {
        this.WRT_sleep = WRT_sleep;
    }

    public String getDOW() {
        return DOW;
    }

    public void setDOW(String DOW) {
        this.DOW = DOW;
    }
}


