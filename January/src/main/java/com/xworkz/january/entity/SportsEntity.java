package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "sports")
@Data
@Entity
@AllArgsConstructor
public class SportsEntity {

    @Id
    @Column(name = "s_id")
    private int id;

    @Column(name = "s_name")
    private String sportName;

    @Column(name = "s_startdate")
    private String startDate;

    @Column(name = "s_numofplayers")
    private int numOfPlayers;

    @Column(name = "s_location")
    private String location;
}
