package com.revature.services;


import com.revature.entities.Location;
import com.revature.exceptions.LocationNotFoundException;
import com.revature.repos.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    LocationRepo locationRepo;

    public LocationServiceImpl() {
    }

    public LocationRepo getLocationRepo() {
        return locationRepo;
    }

    public void setLocationRepo(LocationRepo locationRepo) {
        this.locationRepo = locationRepo;
    }

    @Override
    public Location createLocation(Location location) {
        return null;
    }

    @Override
    public Location getLocationById(int id) throws LocationNotFoundException {
        return null;
    }

    @Override
    public List<Location> getAllLocations() {
        return null;
    }

    @Override
    public Location updateLocation(Location location) throws LocationNotFoundException {
        return null;
    }

    @Override
    public boolean deleteLocation(int id) {
        return false;
    }
}
