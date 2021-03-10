package com.revature.service;

import com.revature.dto.BuildingDto;
import com.revature.model.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repository.BuildingRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuildingServiceImpl implements BuildingService{

	@Autowired
	private BuildingRepository buildingRepository;



	@Override
	public List<BuildingDto> getBuildingsByLocation(int index) {

		List<Building> buildings = buildingRepository.getByLocationId(index);
		return buildings.stream().map(building -> {
			BuildingDto buildingDto = new BuildingDto();
			buildingDto.setId(building.getBuildingId());
			buildingDto.setTotalFloors(building.getTotalFloors());
			buildingDto.setNumRooms(building.getRooms().size());
			buildingDto.setStreet_address(building.getStreetAddress());
			return buildingDto;
		}).collect(Collectors.toList());

	}

}
