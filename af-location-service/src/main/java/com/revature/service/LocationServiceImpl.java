package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import com.revature.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Building;
import com.revature.model.Location;
import com.revature.repository.BuildingRepository;
import com.revature.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService{
	
	private LocationRepository locationRepository;
	
	@Autowired
	public LocationServiceImpl(LocationRepository locationRepository) {

		this.locationRepository=locationRepository;

	}

	@Override
	public void createLocation(LocationRequestDto locationRequestDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LocationDto> getAllLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocationDto> getLocationsByState(String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocationDto> getLocationsByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocationDto> getLocationsByZipCode(String zipCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LocationDetailsDto getLocation(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateState(int index, String state) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCity(int index, String city) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateZipCode(int index, String zipCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLocation(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBuilding(int index, BuildingRequestDto buildingRequestDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLocation(int index, LocationRequestDto locationRequestDto) {
		// TODO Auto-generated method stub
		
	}


	
	
}
