package com.xworkz.playstoreapp.application;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Application {

    private int appId;
    private String appName;
    private String appType;
    private double appVersion;
    private String companyName;
    private int releaseDate;
    private String sizeinMB;



}
