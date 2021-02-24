package com.revature.service;

<<<<<<< HEAD
<<<<<<< HEAD
public interface LocationService {
=======
import java.util.List;

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
>>>>>>> d57213c71dd5399c82558a38d8a9c8cfbc915b7b
=======
public class LocationService {
>>>>>>> d80a76a4bad2d6e72769100379087ae9cdf45708
}
