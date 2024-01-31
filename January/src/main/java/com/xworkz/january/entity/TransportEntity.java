package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "transport")
@Data
@Entity
@AllArgsConstructor
public class TransportEntity {

    @Id
    @Column(name = "t_id")
    private int id;

    @Column(name = "t_modeoftransport")
    private String modeOfTransport;

    @Column(name = "t_vehiclename")
    private String vehicleName;

    @Column(name = "t_companyname")
    private String companyNAme;

    @Column(name = "t_country")
    private String country;


}
