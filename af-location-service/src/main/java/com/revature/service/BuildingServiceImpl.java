package com.revature.service;

import com.revature.dto.BuildingRequestDto;
import com.revature.model.Building;
import com.revature.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dto.BuildingDto;
import com.revature.repository.BuildingRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuildingServiceImpl implements BuildingService{

	@Autowired
	private BuildingRepository buildingRepository;

	@Override
	public List<BuildingDto> getBuildingsByLocation(int index) {

		List<Building> buildings = buildingRepository.findByLocationId(index);
		return buildings.stream().map(building -> {
			BuildingDto buildingDto = new BuildingDto();
			buildingDto.setId(building.getBuildingId());
			buildingDto.setTotalFloors(building.getTotalFloors());
			buildingDto.setNumRooms(building.getRooms().size());
			buildingDto.setStreet_address(building.getStreetAddress());
			return buildingDto;
		}).collect(Collectors.toList());

	}

	@Override
	public void createBuilding(BuildingRequestDto buildingRequestDto, Location location) {

		Building building = new Building();
		building.setStreetAddress(buildingRequestDto.getStreet_address());
		building.setCity(buildingRequestDto.getCity());
		building.setTotalFloors(buildingRequestDto.getTotalFloors());
		building.setLocation(location);
		Building locationBuilding = buildingRepository.save(building);
		location.getBuildings().add(locationBuilding);

	}

}
