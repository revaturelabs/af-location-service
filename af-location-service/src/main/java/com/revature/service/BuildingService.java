package com.revature.service;

import java.util.List;
import com.revature.dto.BuildingDto;

public interface BuildingService{
	
	public List<BuildingDto>getAllBuildingsAtLocation(int id);

    List<BuildingDto> getBuildingsByLocation(int index);

}
