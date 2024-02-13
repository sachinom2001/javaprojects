package com.xworkz.conditioner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "conditioner")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "updateNetQuantityByBrand",query = "update ConditionerEntity ce set ce.netQuantity=:NetQuantity where ce.brand=:Brand")
@NamedQuery(name = "updateNumberOfItemByBrand",query = "update ConditionerEntity ce set ce.numberOfItem=:NumberOfItem where ce.brand=:Brand")
@NamedQuery(name = "findAllByBrand",query = "select ce from ConditionerEntity ce where ce.brand=:Brand")
@NamedQuery(name = "findAllByHairType",query = "select ce from ConditionerEntity ce where ce.hairType=:HairType")
@NamedQuery(name = "findItemFormById",query = "select itemForm from ConditionerEntity ce where ce.id=:Id")
@NamedQuery(name = "getAllNetQuantity",query = "select netQuantity from ConditionerEntity ")
@NamedQuery(name = "getAllBrand",query = "select brand from ConditionerEntity ")
public class ConditionerEntity {

    @Id
    @Column(name = "c_id")
    private int id;

    @Column(name = "c_brand")
    private String brand;

    @Column(name = "c_itemForm")
    private String itemForm;

    @Column(name = "c_hairType")
    private String hairType;

    @Column(name = "c_productBenifits")
    private String productBenifits;

    @Column(name = "c_netQuantity")
    private String netQuantity;

    @Column(name = "c_numberOfitem")
    private int numberOfItem;

    @Column(name = "c_cost")
    private double cost;
}
