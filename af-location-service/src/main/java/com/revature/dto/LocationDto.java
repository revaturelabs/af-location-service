package com.revature.dto;

import com.revature.model.Building;
import lombok.*;

import java.util.List;

@Data
public class LocationDto {
    private int id;
    private String state;
    private String city;
    private String zipCode;
    private List<BuildingDto> buildings;
}
