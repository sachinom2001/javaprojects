package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "toy")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ToyEntity {

    @Id
    @Column(name = "t_id")
    private int id;

    @Column(name = "t_name")
    private String toyName;

    @Column(name = "t_color")
    private String color;

    @Column(name = "t_cost")
    private double cost;

    @Column(name = "t_material")
    private String material;

}
