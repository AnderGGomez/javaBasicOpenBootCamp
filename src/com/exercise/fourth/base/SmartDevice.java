package com.exercise.fourth.base;

public abstract class SmartDevice {
    private String company;
    private double screenSize;
    private String screenType;
    private int battery;
    private String operatingSystem;
    private String versionSystem;

    private String processorName;

    private int memoryRam;
    private int internalStorage;

    //constructor
    public SmartDevice() {
    }

    public SmartDevice(String company, double screenSize, String screenType, int battery, String operatingSystem, String versionSystem, String processorName, int memoryRam, int internalStorage) {
        this.company = company;
        this.screenSize = screenSize;
        this.screenType = screenType;
        this.battery = battery;
        this.operatingSystem = operatingSystem;
        this.versionSystem = versionSystem;
        this.processorName = processorName;
        this.memoryRam = memoryRam;
        this.internalStorage = internalStorage;
    }

    //Methods


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getVersionSystem() {
        return versionSystem;
    }

    public void setVersionSystem(String versionSystem) {
        this.versionSystem = versionSystem;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public int getMemoryRam() {
        return memoryRam;
    }

    public void setMemoryRam(int memoryRam) {
        this.memoryRam = memoryRam;
    }

    public int getInternalStorage() {
        return internalStorage;
    }

    public void setInternalStorage(int internalStorage) {
        this.internalStorage = internalStorage;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "company='" + company + '\'' +
                ", screenSize=" + screenSize +
                ", screenType='" + screenType + '\'' +
                ", battery=" + battery +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", versionSystem='" + versionSystem + '\'' +
                ", processorName='" + processorName + '\'' +
                ", memoryRam=" + memoryRam +
                ", internalStorage=" + internalStorage +
                '}';
    }
}
