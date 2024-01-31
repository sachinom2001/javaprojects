package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "festival")
@Data
@Entity
@AllArgsConstructor
public class FestivalEntity {

    @Id
    @Column(name = "f_id")
    private int id;

    @Column(name = "f_name")
    private String festivalName;

    @Column(name = "f_place")
    private String place;

    @Column(name = "f_god")
    private String god;

    @Column(name = "f_religion")
    private String religion;
}
