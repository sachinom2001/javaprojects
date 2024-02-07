package com.xworkz.collection.set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Employer implements Comparable<Employer>{

    private Integer employeeId;
    private String employeeName;
    private String jobRole;
    private String emailId;
    private long phoneNo;

    @Override
    public int compareTo(Employer o) {
        return this.employeeId - o.employeeId;
    }


}
