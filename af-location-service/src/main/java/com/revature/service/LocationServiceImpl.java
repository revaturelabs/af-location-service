package com.revature.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
		List<Location> locations = locationRepository.findAll();

		return locations.stream().map(location -> {
			LocationDto locationDto = new LocationDto();
			locationDto.setId(location.getLocationId());
			locationDto.setCity(location.getCity());
			locationDto.setState(location.getState());
			locationDto.setZipCode(location.getZipCode());
			locationDto.setNumBuildings(location.getBuildings().size());
			return locationDto;
		}).collect(Collectors.toList());
	}

	@Override
	public List<LocationDto> getLocationsByState(String state) {
		String sanitizedState = this.sanitizeState(state);
		List<LocationDto> locations = this.getAllLocations();
		return locations.stream()
				.filter(locationDto -> locationDto.getState().equals(sanitizedState)).collect(Collectors.toList());
	}

	@Override
	public List<LocationDto> getLocationsByCity(String city) {
		String sanitizedCity = this.sanitizeCity(city);
		List<LocationDto> locations = this.getAllLocations();
		return locations.stream()
				.filter(locationDto -> locationDto.getCity().equals(sanitizedCity)).collect(Collectors.toList());
	}

	@Override
	public List<LocationDto> getLocationsByZipCode(String zipCode) {
		if( zipCode.length() > 5 ) {
			zipCode = zipCode.substring(0,4);
		}

		String sanitizedZipCode = zipCode;
		List<LocationDto> locations = this.getAllLocations();
		return locations.stream()
				.filter(locationDto -> locationDto.getZipCode().equals(sanitizedZipCode)).collect(Collectors.toList());
	}

	@Override
	public LocationDetailsDto getLocation(int index) {
		Location location = locationRepository.findById(index).get();
		LocationDetailsDto locationDetailsDto = new LocationDetailsDto();

		locationDetailsDto.setId(location.getLocationId());
		locationDetailsDto.setCity(location.getCity());
		locationDetailsDto.setState(location.getState());
		locationDetailsDto.setZipCode(location.getZipCode());

		List<BuildingDto> buildingDtos = location.getBuildings().stream().map(building -> {
			BuildingDto buildingDto = new BuildingDto();
			buildingDto.setId(building.getBuildingId());
			buildingDto.setStreet_address(building.getStreetAddress());
			buildingDto.setTotalFloors(building.getTotalFloors());
			buildingDto.setNumRooms(building.getRooms().size());
			return buildingDto;
		}).collect(Collectors.toList());
		locationDetailsDto.setBuildings(buildingDtos);

		return locationDetailsDto;
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

	// helper methods
	private String sanitizeState(String state) {
		if( state.length() > 2 ) {
			if( state.equals("Virginia") || state.equals("virginia") || state.equals("VIRGINIA") ) {
				state = "VA";
			} else if( state.equals("Texas") || state.equals("texas") || state.equals("TEXAS") ) {
				state = "TX";
			} else if( state.equals("Florida") || state.equals("florida") || state.equals("FLORIDA") ) {
				state = "FL";
			}
		}
		String sanitizedState = state.toUpperCase(Locale.ROOT);

		return sanitizedState;
	}

	private String sanitizeCity(String city) {
		city = city.toLowerCase(Locale.ROOT);

		if( city.equals("reston") ) {
			city = "Reston";
		} else if( city.equals("arlington") ) {
			city = "Arlington";
		} else if( city.equals("tampa") ) {
			city = "Tampa";
		}

		String sanitizedCity = city;
		return sanitizedCity;
	}
	
}
