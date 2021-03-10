package com.revature.service;

import com.revature.dto.BuildingDto;

import java.util.List;

public interface BuildingService{

    List<BuildingDto> getBuildingsByLocation(int index);

}
