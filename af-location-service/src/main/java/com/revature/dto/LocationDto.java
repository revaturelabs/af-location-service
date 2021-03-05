package com.revature.dto;

<<<<<<< HEAD
import com.revature.model.Building;
import lombok.*;

import java.util.List;

@Data
public class LocationDto {

    public int id;
    public String state;
    public String city;
    public String zipCode;
    public List<BuildingDto> buildings;
=======
import java.util.List;

public class LocationDto {
	
	public int id;
	public String state;
	public String city;
	public String zipCode;
	public List<BuildingDto> buildings;
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b

}
