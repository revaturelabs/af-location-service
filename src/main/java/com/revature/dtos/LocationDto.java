package com.revature.dtos;

import com.revature.entities.Building;
import com.revature.entities.Location;

import java.util.List;

public class LocationDto {

    private int locationId;
    private String city;
    private String state;
    private String zipcode;
    private List<Building> buildings;

    public LocationDto() {
    }

    public LocationDto(Location location){
        this.locationId = location.getLocationId();
        this.city = location.getCity();
        this.state = location.getState();
        this.zipcode = location.getZipcode();
        this.buildings = location.getBuildings();
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

}
