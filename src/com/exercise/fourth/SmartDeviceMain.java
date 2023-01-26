package com.exercise.fourth;

import com.exercise.fourth.specification.Smartphone;
import com.exercise.fourth.specification.Smartwatch;

public class SmartDeviceMain {
    public static void main(String[] args) {

        Smartphone smartphoneTest = new Smartphone();
        smartphoneTest.setProcessorName("Snapdragon 820");
        smartphoneTest.setCompany("Xiaomi");
        smartphoneTest.setBattery(5500);
        smartphoneTest.setInternalStorage(128);
        smartphoneTest.setMemoryRam(12);
        smartphoneTest.setScreenType("Amoled");
        smartphoneTest.setOperatingSystem("Android");
        smartphoneTest.setVersionSystem("12");
        smartphoneTest.setScreenSize(11.2);

        smartphoneTest.setJackinput(false);
        smartphoneTest.setSelfieCamera("Sony 23Ax");
        smartphoneTest.setNetwork("LTE/GSMA/HSPA");
        smartphoneTest.setMainCamera("Sony x223432");

        Smartwatch smartwatchTest = new Smartwatch();
        smartwatchTest.setProcessorName("Snapdragon 420");
        smartwatchTest.setCompany("Xiaomi");
        smartwatchTest.setBattery(350);
        smartwatchTest.setInternalStorage(4);
        smartwatchTest.setMemoryRam(1);
        smartwatchTest.setScreenType("Amoled");
        smartwatchTest.setOperatingSystem("xioami os");
        smartwatchTest.setVersionSystem("4");
        smartwatchTest.setScreenSize(1.5);

        System.out.println(smartphoneTest);
        System.out.println(smartwatchTest);
    }
}
