package com.revature.model;

import java.util.List;

public class Location {

    private int id;
    private String state;
    private String city;
    private List<Building> buildings;

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState( String state ) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity( String city ) {
        this.city = city;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings( List<Building> buildings ) {
        this.buildings = buildings;
    }
}
