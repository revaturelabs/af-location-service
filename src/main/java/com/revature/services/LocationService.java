package com.revature.services;

import com.revature.entities.Location;
import com.revature.exceptions.LocationNotFoundException;

import java.util.List;

public interface LocationService {

    Location createLocation(Location location);
    Location getLocationById(int id) throws LocationNotFoundException;
    List<Location> getAllLocations();
    Location updateLocation(Location location) throws LocationNotFoundException;
    boolean deleteLocation(int id);



}
