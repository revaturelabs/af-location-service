package com.revature.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "building")
public class Building {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="building_id")
    private int buildingId;

    @Column(name = "address")
    private String address;

    @Column(name = "loc_id")
    private int locationId;

    @OneToMany(mappedBy = "buildingId")
    List<Room> rooms;

    public Building() {
    }

    public Building(int buildingId, String address, int locationId) {
        this.buildingId = buildingId;
        this.address = address;
        this.locationId = locationId;
    }

    public int getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(int buildingId) {
        this.buildingId = buildingId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Building{" +
                "buildingId=" + buildingId +
                ", address='" + address + '\'' +
                ", locationId=" + locationId +
                ", rooms=" + rooms +
                '}';
    }
}
