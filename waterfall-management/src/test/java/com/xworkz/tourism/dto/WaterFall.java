package com.xworkz.tourism.dto;


public class WaterFall {

    private int id;
    private String name;
    private String place;
    private String river_name;
    private String state;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    public String getPlace() {
        return place;
    }

    public void setRiver_name(String river_name) {
        this.river_name = river_name;
    }

    public String getRiver_name() {
        return river_name;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getState() {
        return state;
    }


    public WaterFall(){

    }

    public WaterFall(String name, String place ,String river_name, String state){
        this.name= name;
        this.place = place;
        this.river_name = river_name;
        this.state = state;

    }

}
