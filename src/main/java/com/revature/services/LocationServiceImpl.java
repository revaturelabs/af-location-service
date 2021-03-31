package com.revature.services;


import com.revature.repos.LocationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class LocationServiceImpl {

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
}
