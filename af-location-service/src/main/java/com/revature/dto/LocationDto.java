package com.revature.dto;

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

}
