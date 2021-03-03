package com.revature.service;

import java.util.List;

import com.revature.dto.LocationDetailsDto;
import com.revature.dto.LocationRequestDto;
import com.revature.model.Building;
import com.revature.model.Location;
import org.springframework.beans.factory.annotation.Autowired;

import com.revature.dto.BuildingDto;
import com.revature.dto.LocationDto;
import com.revature.repository.BuildingRepository;
import com.revature.repository.LocationRepository;

public class LocationService {

	@Autowired
	LocationRepository locationRepository;
	@Autowired
	BuildingRepository BuildingRepository;

	public void createLocation(Location location) {

	}

	public List<LocationDto> getAllLocations(){
		return null;
	}

	public List<LocationDto> getLocationsByState(String state){
		return null;
	}

	public List<LocationDto> getLocationsByCity(String city){
		return null;
	}

	public List<LocationDto> getLocationsByZipCode(String zipCode){
		return null;
	}

	public LocationDetailsDto getLocation(int index) {
		return null;
	}

	public void updateState(int index,String state) {

	}

	public void updateCity(int index, String city) {

	}

	public void updateZipCode(int index, String zipCode) {

	}

	public void deleteLocation(int index) {

	}

	public void addBuilding(int index, Building building) {

	}

	public void updateLocation(int index, LocationRequestDto locationRequestDto) {

	}
}
