package com.xworkz.disease.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "disease")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class DiseaseEntity {

    @Id
    @Column(name = "d_id")
    private int id;

    @Column(name = "d_name")
    private String name;

    @Column(name = "d_symptoms")
    private String symptoms;

    @Column(name = "d_treatment")
    private String treatment;

    @Column(name = "d_contagious")
    private String contagious;
}
