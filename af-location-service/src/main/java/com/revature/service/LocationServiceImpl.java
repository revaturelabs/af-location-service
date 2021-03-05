package com.revature.service;

<<<<<<< HEAD
import com.revature.dto.BuildingDto;
import com.revature.dto.LocationDto;
import com.revature.repository.BuildingRepository;
import com.revature.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LocationServiceImpl {

    @Autowired
    LocationRepository locationRepository;
    @Autowired
    BuildingRepository BuildingRepository;

    public void createLocation( LocationDto dto ) {

    }

    public List<LocationDto> getAllLocations() {
        return null;
    }

    public List<LocationDto> getLocationsByState( String state ) {
        return null;
    }

    public List<LocationDto> getLocationsByCity( String city ) {
        return null;
    }

    public List<LocationDto> getLocationsByZipCode( String zipCode ) {
        return null;
    }

    public LocationDto getLocation( int index ) {
        return null;
    }

    public void updateState( int index, String state ) {

    }

    public void updateCity( int index, String city ) {

    }

    public void updateZipCode( int index, String zipCode ) {

    }

    public void deleteLocation( int index ) {

    }

    public void addBuilding( int index, BuildingDto buildingDto ) {

    }

    public void updateLocation( int index, LocationDto locationDto ) {

    }
}
=======
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dto.BuildingDto;
import com.revature.dto.LocationDto;
import com.revature.model.Building;
import com.revature.model.Location;
import com.revature.repository.BuildingRepository;
import com.revature.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService{
	
	private LocationRepository lr;
	
	@Autowired
	public LocationServiceImpl(LocationRepository lr) {
		this.lr=lr;
	}

	@Override
	public void createLocation(Location location) {
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
	public LocationDto getLocation(int index) {
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
	public void addBuilding(int index, BuildingDto buildingDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateLocation(int index, Location location) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<BuildingDto> getAllBuildings() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
