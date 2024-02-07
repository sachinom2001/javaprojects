package com.xworkz.collection.queue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class Patient implements Comparable<Patient> {

    private Integer patientId;
    private String patientName;
    private long phoneNo;
    private String adress;

    @Override
    public int compareTo(Patient o) {
        return this.patientId - o.patientId;
    }
}
