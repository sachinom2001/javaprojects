package com.xworkz.cellphoneproducts.smartphone;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class SmartPhone {


    private String deviceName;
    private String model;
    private int androidVersion;
    private String processor;
    private String deviceStorage;
    private String ram;
    private String cameraResolution;
    private String batteryCapacity;
    private double price;

}
