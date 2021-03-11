package com.revature.dto;

public class BuildingDto {

	public BuildingDto() {

	}

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public String getStreet_address() {

		return street_address;
	}

	public void setStreet_address(String street_address) {

		this.street_address = street_address;
	}

	public int getTotalFloors() {

		return totalFloors;
	}

	public void setTotalFloors(int totalFloors) {

		this.totalFloors = totalFloors;
	}

	public int getNumRooms() {

		return numRooms;
	}

	public void setNumRooms(int numRooms) {

		this.numRooms = numRooms;
	}

	private int id;
	private String street_address;
	private int totalFloors;
	private int numRooms;

}
