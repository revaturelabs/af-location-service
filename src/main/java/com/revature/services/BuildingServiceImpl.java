package com.revature.services;

import com.revature.entities.Building;
import com.revature.entities.Location;
import com.revature.repos.BuildingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
@Service
public class BuildingServiceImpl implements BuildingService{

    @Autowired
    BuildingRepo buildingRepo;

//    public BuildingServiceImpl() {
//    }
//
//    public BuildingRepo getBuildingRepo() {
//        return buildingRepo;
//    }
//
//    public void setBuildingRepo(BuildingRepo buildingRepo) {
//        this.buildingRepo = buildingRepo;
//    }

    @Override
    public Building createBuilding(Building building) {
        return null;
//        return this.buildingRepo.save(building);
    }

    @Override
    public List<Building> getAllBuildings() {
//        return (List<Building>) this.buildingRepo.findAll();
        return null;
    }

    @Override
    public Building getBuildingById(int id) {
//        return this.buildingRepo.findById(id).orElse(null);
        return null;
    }

    @Override
    public List<Building> getBuildingByLocation(Location location) {
        return null;
//        int id = location.getLocationId();
//        List<Building> buildings = this.buildingRepo.findBuildingsByLocationId(id);
//        // Add logic for searching by city OR state
//        return buildings;
    }

    @Override
    public Building updateBuilding(Building building) {
//        return this.buildingRepo.save(building);
        return null;
    }

    @Override
    public boolean deleteBuildingById(int id) {
//        try{
//            this.buildingRepo.delete(this.buildingRepo.findById(id).orElse(null));
//            return true;
//        }catch(Exception e){
//            e.printStackTrace();
//            return false;
//        }
        return false;
    }
}
