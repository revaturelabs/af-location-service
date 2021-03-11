package com.revature.dto;

public class RoomDto {

	private int id;
	private String type;
	private String occupation;

	public RoomDto() {

	}

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public String getType() {

		return type;
	}

	public void setType(String type) {

		this.type = type;
	}

	public String getOccupation() {

		return occupation;
	}

	public void setOccupation(String occupation) {

		this.occupation = occupation;
	}

	public RoomDto(int id, String type, String occupation) {

		this.id = id;
		this.type = type;
		this.occupation = occupation;
	}

}
