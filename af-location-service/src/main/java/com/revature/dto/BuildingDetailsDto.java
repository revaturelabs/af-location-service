package com.revature.dto;

import java.util.List;

public class BuildingDetailsDto {

    public BuildingDetailsDto() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public String getStreet_address() {

        return street_address;
    }

    public void setStreet_address(String street_address) {

        this.street_address = street_address;
    }

    public String getZipCode() {

        return zipCode;
    }

    public void setZipCode(String zipCode) {

        this.zipCode = zipCode;
    }

    public int getTotalFloors() {

        return totalFloors;
    }

    public void setTotalFloors(int totalFloors) {

        this.totalFloors = totalFloors;
    }

    public List<RoomDto> getRooms() {

        return rooms;
    }

    public void setRooms(List<RoomDto> rooms) {

        this.rooms = rooms;
    }

    private int id;
    private String city;
    private String street_address;
    private String zipCode;
    private int totalFloors;
    private List<RoomDto> rooms;

}
