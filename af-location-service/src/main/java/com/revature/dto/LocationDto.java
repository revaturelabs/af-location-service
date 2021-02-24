package com.revature.dto;

import com.revature.model.Building;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class LocationDto {
    private int id;
    private String state;
    private String city;
    private String zipCode;
    private List<Building> buildings;
}
