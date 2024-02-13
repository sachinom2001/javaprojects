package com.xworkz.temple.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "temple")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name = "findAllByLocation",query = "select te from TempleEntity te where te.location=: place")
@NamedQuery(name = "findAllByEntryFeeGreaterThan", query = "select te from TempleEntity te where te.entryFee>: EntryFee ")
@NamedQuery(name = "findAllByEntryFeeBetween", query = "select te from TempleEntity te where te.entryFee >: startFee and te.entryFee <: endFee")
@NamedQuery(name = "findAllByInaguratedDateGreaterThan",query = "select te from TempleEntity te where te.inaguratedDate >: InaguratedDate ")
@NamedQuery(name = "findAllByMainGodAndLocation",query = "select te from TempleEntity te where te.mainGod=: MainGod and te.location=: Location")
@NamedQuery(name = "findById",query = "select te from TempleEntity te where te.id=: templeId ")
@NamedQuery(name = "findByIdAndMainGod",query = "select te from TempleEntity te where te.id=: TempleId and te.mainGod=: MainGod")
@NamedQuery(name = "findTotal",query = "select count(te) from TempleEntity te")
@NamedQuery(name = "findTempleByMexEntryFee",query = "select max(te.entryFee) from TempleEntity te")
@NamedQuery(name = "updateLocationByName",query = "update TempleEntity te set te.location=:Location  where te.name=:Name")
@NamedQuery(name = "updateEntryFeeByName",query = "update TempleEntity te set te.entryFee=:EntryFee where te.name=:Name ")
@NamedQuery(name = "updateLocationAndDimensionById",query = "update TempleEntity te set te.location=:Location,te.dimensionInAcre=:Dimension where id=:Id ")
@NamedQuery(name = "updateAllVipEntry",query = "update TempleEntity te set te.vipEntry=:VipEntry where te.id=: Id")
@NamedQuery(name = "deleteByName",query = "delete from TempleEntity te where te.name=:Name ")

public class TempleEntity {

    @Id
    @Column(name = "t_id")
    private int id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_location")
    private String location;

    @Column(name = "t_entryFee")
    private int entryFee;

    @Column(name = "t_vipEntry")
    private int vipEntry;

    @Column(name = "t_inagurateddate")
    private LocalDate inaguratedDate;

    @Column(name = "t_mainGod")
    private String mainGod;

    @Column(name = "t_dimension")
    private int dimensionInAcre;



}