package com.revature.service;


import java.util.List;
import com.revature.dto.BuildingDto;
import com.revature.dto.BuildingRequestDto;
import com.revature.model.Location;

public interface BuildingService{

    List<BuildingDto> getBuildingsByLocation(int index);
    void createBuilding(BuildingRequestDto buildingRequestDto, Location location);

}
