package com.xworkz.travel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "travel")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class TravelEntity {

    @Id
    @Column(name = "t_id")
    private int id;

    @Column(name = "t_source")
    private String source;

    @Column(name = "t_destination")
    private String destination;

    @Column(name = "t_budget")
    private double budget;

    @Column(name = "t_distance")
    private int distance;

    @Column(name = "t_duration")
    private String duration;

    @Column(name = "t_modeType")
    private String modeType;

    @Column(name = "t_date")
    private String date;

    @Column(name = "t_returnDate")
    private String returnDate;

}
