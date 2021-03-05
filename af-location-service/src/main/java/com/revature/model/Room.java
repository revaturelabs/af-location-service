package com.revature.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.revature.statics.RoomOccupation;
import com.revature.statics.RoomType;
import lombok.Data;

<<<<<<< HEAD
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Map;


@Data
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
=======
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="room_id")
    private int roomId;
	
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
    private String name;
    
    private RoomType type;
    
    private RoomOccupation occupation;
    
    private int capacity;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Building building;
    private Map<String, Integer> roomAmenities;
    private int floorNumber;


    public Map<String, Integer> getRoomAmenities() {
        return roomAmenities;
    }

    public void setRoomAmenities( Map<String, Integer> roomAmenities ) {
        this.roomAmenities = roomAmenities;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

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
    
    

<<<<<<< HEAD
    public void setFloorNumber( int floorNumber ) {
        this.floorNumber = floorNumber;
    }
=======
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Room(int id, String name, RoomType type, RoomOccupation occupation, int capacity, Building building) {
		super();
		this.roomId = id;
		this.name = name;
		this.type = type;
		this.occupation = occupation;
		this.capacity = capacity;
		this.building = building;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RoomType getType() {
		return type;
	}

	public void setType(RoomType type) {
		this.type = type;
	}

	public RoomOccupation getOccupation() {
		return occupation;
	}

	public void setOccupation(RoomOccupation occupation) {
		this.occupation = occupation;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((building == null) ? 0 : building.hashCode());
		result = prime * result + capacity;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + roomId;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (building == null) {
			if (other.building != null)
				return false;
		} else if (!building.equals(other.building))
			return false;
		if (capacity != other.capacity)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (occupation != other.occupation)
			return false;
		if (roomId != other.roomId)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", name=" + name + ", type=" + type + ", occupation=" + occupation
				+ ", capacity=" + capacity + ", building=" + building + "]";
	}


	
    
    

>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
}
