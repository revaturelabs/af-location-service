package com.revature.model;

import com.revature.statics.RoomOccupation;
import com.revature.statics.RoomType;
import lombok.Data;

<<<<<<< HEAD
import javax.persistence.Entity;
import java.util.Map;


=======
@Data
>>>>>>> 5ec92f4fe20eb3496637b65d3f4e23deabaa67b8
public class Room {

    private int id;
    private String name;
    private RoomType type;
    private RoomOccupation occupation;
    private int capacity;
    private Building building;
<<<<<<< HEAD
    private Map<String, Integer> roomAmenities;
    private int floorNumber;

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public RoomType getType() {
        return type;
    }

    public void setType( RoomType type ) {
        this.type = type;
    }

    public RoomOccupation getOccupation() {
        return occupation;
    }

    public void setOccupation( RoomOccupation occupation ) {
        this.occupation = occupation;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity( int capacity ) {
        this.capacity = capacity;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding( Building building ) {
        this.building = building;
    }

    public Map<String, Integer> getRoomAmenities() {
        return roomAmenities;
    }

    public void setRoomAmenities( Map<String, Integer> roomAmenities ) {
        this.roomAmenities = roomAmenities;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
=======
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public RoomType getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(RoomType type) {
		this.type = type;
	}
	/**
	 * @return the occupation
	 */
	public RoomOccupation getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(RoomOccupation occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	/**
	 * @return the building
	 */
	public Building getBuilding() {
		return building;
	}
	/**
	 * @param building the building to set
	 */
	public void setBuilding(Building building) {
		this.building = building;
	}
    
    
>>>>>>> 5ec92f4fe20eb3496637b65d3f4e23deabaa67b8

    public void setFloorNumber( int floorNumber ) {
        this.floorNumber = floorNumber;
    }
}
