package com.xworkz.january.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "shop")
@Data
@Entity
@AllArgsConstructor
public class ShopEntity {

    @Id
    @Column(name = "s_id")
    private int id;

    @Column(name = "s_name")
    private String shopName;

    @Column(name = "s_ownername")
    private String ownerName;

    @Column(name = "s_category")
    private String category;

    @Column(name = "s_address")
    private String address;


}
