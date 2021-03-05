package com.revature.service;

<<<<<<< HEAD


import com.revature.dto.BuildingDto;
import com.revature.dto.LocationDto;
import com.revature.repository.BuildingRepository;
import com.revature.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LocationService {
	
	@Autowired
	LocationRepository locationRepository;
	@Autowired
	BuildingRepository buildingRepository;
	
	public void createLocation(LocationDto dto) {
		
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
	
	public LocationDto getLocation( int index) {
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
	
	public void addBuilding(int index, BuildingDto buildingDto) {
		
	}
	
	public void updateLocation(int index, LocationDto locationDto) {
		
	}
=======
import java.util.List;

import com.revature.dto.BuildingDto;
import com.revature.dto.LocationDto;
import com.revature.model.Building;
import com.revature.model.Location;

public interface LocationService {
	
	public void createLocation(Location location);
	public List<LocationDto> getAllLocations();
	public List<LocationDto> getLocationsByState(String state);	
	public List<LocationDto> getLocationsByCity(String city);	
	public List<LocationDto> getLocationsByZipCode(String zipCode);	
	public LocationDto getLocation( int index);	
	public void updateState(int index,String state);
	public void updateCity(int index, String city);	
	public void updateZipCode(int index, String zipCode);
	public void deleteLocation(int index);	
	public void addBuilding(int index, BuildingDto buildingDto);
	public List<BuildingDto> getAllBuildings();
	public void updateLocation(int index, Location location);

>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
}
