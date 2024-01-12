package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "actor")
@Data
@Entity
@AllArgsConstructor
public class ActorEntity {

    @Id
    @Column(name = "a_id")
    private int id;

    @Column(name = "a_actorname")
    private String actorName;

    @Column(name = "a_birthplace")
    private String birthPlace;

    @Column(name = "a_titlename")
    private String titleName;

    @Column(name = "a_movie")
    private String movie;


}
