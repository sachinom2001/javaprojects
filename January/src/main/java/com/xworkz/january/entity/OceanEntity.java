package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ocean")
@Data
@Entity
@AllArgsConstructor
public class OceanEntity {

    @Id
    @Column(name = "o_id")
    private int id;

    @Column(name = "o_name")
    private String oceanName;

    @Column(name = "o_depth")
    private int depth;

    @Column(name = "o_surfacearea")
    private double surfaceArea;

    @Column(name = "o_primaryports")
    private String primaryPorts;


}
