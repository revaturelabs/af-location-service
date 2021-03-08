package com.revature.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.revature.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Building;
import com.revature.model.Location;
import com.revature.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService{

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void createLocation( LocationRequestDto locationRequestDto ) {

		Location location = new Location();
		location.setCity( locationRequestDto.getCity() );
		location.setState(locationRequestDto.getState());
		location.setZipCode(locationRequestDto.getZipCode());
		locationRepository.save(location);
		
	}

	@Override
	public List<LocationDto> getAllLocations() {

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

		Location location = locationRepository.findById(index).get();
		location.setState(state);
		locationRepository.save(location);
		
	}

	@Override
	public void updateCity(int index, String city) {

		Location location = locationRepository.findById(index).get();
		location.setCity(city);
		locationRepository.save(location);
		
	}

	@Override
	public void updateZipCode(int index, String zipCode) {

		Location location = locationRepository.findById(index).get();
		location.setZipCode(zipCode);
		locationRepository.save(location);
		
	}

	@Override
	public void deleteLocation(int index) {

		locationRepository.deleteById(index);

	}

	@Override
	public void addBuilding(int index, BuildingRequestDto buildingRequestDto) {

		Location location = locationRepository.findById(index).get();
		Building building = new Building();
		building.setLocation(location);
		building.setTotalFloors(buildingRequestDto.getTotalFloors());
		building.setStreetAddress(buildingRequestDto.getStreet_address());
		building.setCity(buildingRequestDto.getCity());
		location.getBuildings().add(building);
		locationRepository.save(location);
		
	}

	@Override
	public void updateLocation(int index, LocationRequestDto locationRequestDto) {

		Location location = locationRepository.findById(index).get();
		location.setState(locationRequestDto.getState());
		location.setCity(locationRequestDto.getCity());
		location.setZipCode(locationRequestDto.getZipCode());
		locationRepository.save(location);
		
	}


	
	
}
