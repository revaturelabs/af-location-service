package com.revature.dtos;

import com.revature.entities.Building;
import com.revature.entities.Room;

import java.util.List;

public class BuildingDto {

    private int buildingId;
    private String address;
    private int locationId;
    List<Room> rooms;

    public BuildingDto() {
    }
    public BuildingDto(Building building){
        this.buildingId = building.getBuildingId();
        this.address = building.getAddress();
        this.locationId = building.getLocationId();

    }
    public int getBuildingId() {
        return buildingId;
    }

    public String getAddress() {
        return address;
    }

    public int getLocationId() {
        return locationId;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
