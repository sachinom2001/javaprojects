package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.AllArguments;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "super_hero")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SuperHeroEntity {

    @Id
    @Column(name = "s_id")
    private int id;

    @Column(name = "s_realname")
    private String realName;

    @Column(name = "s_fictionalname")
    private String fictionalName;

    @Column(name = "s_power")
    private String power;

    @Column(name = "s_country")
    private String country;

    @Column(name = "s_weakness")
    private String weakness;

}
