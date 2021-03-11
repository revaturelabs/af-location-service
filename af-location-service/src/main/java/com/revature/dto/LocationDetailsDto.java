package com.revature.dto;

import java.util.List;

public class LocationDetailsDto {

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getState() {

        return state;
    }

    public void setState(String state) {

        this.state = state;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getZipCode() {

        return zipCode;
    }

    public void setZipCode(String zipCode) {

        this.zipCode = zipCode;
    }

    public List<BuildingDto> getBuildings() {

        return buildings;
    }

    public void setBuildings(List<BuildingDto> buildings) {

        this.buildings = buildings;
    }

    private int id;
    private String state;
    private String city;
    private String zipCode;
    private List<BuildingDto> buildings;

}
