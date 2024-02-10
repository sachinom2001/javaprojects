package com.xworkz.policestationapp.PoliceStation;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

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
