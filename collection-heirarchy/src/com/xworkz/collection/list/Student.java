package com.xworkz.collection.list;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor

public class Student implements Comparable<Student>{

    private Integer studentUSN;
    private String studentName;
    private String studentClass;
    private String branch;
    private String address;

    @Override
    public int compareTo(Student o) {
        return this.studentUSN - o.studentUSN;
    }
}
