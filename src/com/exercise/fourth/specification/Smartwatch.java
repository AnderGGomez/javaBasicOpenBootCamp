package com.exercise.fourth.specification;

import com.exercise.fourth.base.SmartDevice;

import java.util.ArrayList;

public class Smartwatch extends SmartDevice {
    ArrayList sensors = new ArrayList<>();
    char strapSize;
    int strapLength;
    String strapMaterial;

    public Smartwatch() {
    }

    public Smartwatch(String company, float screenSize, String screenType, int battery, String operatingSystem, String versionSystem, String processorName, int memoryRam, int internalStorage, ArrayList sensors, char strapSize, int strapLength, String strapMaterial) {
        super(company, screenSize, screenType, battery, operatingSystem, versionSystem, processorName, memoryRam, internalStorage);
        this.sensors = sensors;
        this.strapSize = strapSize;
        this.strapLength = strapLength;
        this.strapMaterial = strapMaterial;
    }

    public ArrayList getSensors() {
        return sensors;
    }

    public void setSensors(ArrayList sensors) {
        this.sensors = sensors;
    }

    public char getStrapSize() {
        return strapSize;
    }

    public void setStrapSize(char strapSize) {
        this.strapSize = strapSize;
    }

    public int getStrapLength() {
        return strapLength;
    }

    public void setStrapLength(int strapLength) {
        this.strapLength = strapLength;
    }

    public String getStrapMaterial() {
        return strapMaterial;
    }

    public void setStrapMaterial(String strapMaterial) {
        this.strapMaterial = strapMaterial;
    }
}
