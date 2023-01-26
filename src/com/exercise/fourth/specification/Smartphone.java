package com.exercise.fourth.specification;

import com.exercise.fourth.base.SmartDevice;

public class Smartphone extends SmartDevice {
    private boolean jackinput;
    private String mainCamera;
    private String selfieCamera;
    private String network;

    public Smartphone() {

    }

    public Smartphone(String company, float screenSize, String screenType, int battery, String operatingSystem, String versionSystem, String processorName, int memoryRam, int internalStorage, boolean jackinput, String mainCamera, String selfieCamera, String network) {
        super(company, screenSize, screenType, battery, operatingSystem, versionSystem, processorName, memoryRam, internalStorage);
        this.jackinput = jackinput;
        this.mainCamera = mainCamera;
        this.selfieCamera = selfieCamera;
        this.network = network;
    }

    public boolean isJackinput() {
        return jackinput;
    }

    public void setJackinput(boolean jackinput) {
        this.jackinput = jackinput;
    }

    public String getMainCamera() {
        return mainCamera;
    }

    public void setMainCamera(String mainCamera) {
        this.mainCamera = mainCamera;
    }

    public String getSelfieCamera() {
        return selfieCamera;
    }

    public void setSelfieCamera(String selfieCamera) {
        this.selfieCamera = selfieCamera;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }


}
