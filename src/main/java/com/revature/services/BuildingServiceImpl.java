package com.revature.services;

import com.revature.repos.BuildingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class BuildingServiceImpl {

    @Autowired
    BuildingRepo buildingRepo;

    public BuildingServiceImpl() {
    }

    public BuildingRepo getBuildingRepo() {
        return buildingRepo;
    }

    public void setBuildingRepo(BuildingRepo buildingRepo) {
        this.buildingRepo = buildingRepo;
    }
}
