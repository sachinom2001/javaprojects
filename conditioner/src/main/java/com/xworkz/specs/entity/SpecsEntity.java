package com.xworkz.specs.entity;


import lombok.*;

import javax.persistence.*;

@Table(name = "specs")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

@NamedQuery(name = "deleteByName",query = "delete from SpecsEntity se where se.name=:Name ")
@NamedQuery(name = "updateColorByName",query = "update SpecsEntity se set se.color=:Color where se.name=:Name")
@NamedQuery(name = "findByLens",query = "select se from SpecsEntity se where se.lens=:Lens")
@NamedQuery(name = "findAll",query = "select se from SpecsEntity se ")
@NamedQuery(name = "findNameByAll",query = "select name from SpecsEntity se")

public class SpecsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private int id;

    @Column(name = "s_name")
    private String name;

    @Column(name = "s_lens")
    private String lens;

    @Column(name = "s_color")
    private String color;

    public SpecsEntity(String name,String lens,String color){
        this.name=name;
        this.lens=lens;
        this.color=color;
    }

}
