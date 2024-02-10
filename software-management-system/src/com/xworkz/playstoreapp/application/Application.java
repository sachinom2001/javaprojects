package com.xworkz.playstoreapp.application;

import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Application {

    private int appId;
    private String appName;
    private String appType;
    private double appVersion;
    private String companyName;
    private int releaseDate;
    private String sizeinMB;



}
