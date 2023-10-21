package com.xworkz.policestationapp.PoliceStation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor


public class Officer {

    private int officerID;
    private String officerName;
    private String postName;
    private int age;
    private String gender;
    private String bloodGroup;
    private String emailId;
    private String address;
}
