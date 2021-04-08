package com.revature.services;

import com.revature.entities.Building;
import com.revature.exceptions.BuildingNotFoundException;
import com.revature.repos.BuildingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
@Service
public class BuildingServiceImpl implements BuildingService{

    @Autowired
    BuildingRepo buildingRepo;

    @Override
    public Building createBuilding(Building building) {
        building.setBuildingId(0);
        this.buildingRepo.save(building);
        return building;
    }

    @Override
    public List<Building> getAllBuildings() {
        return (List<Building>) this.buildingRepo.findAll();
    }

    @Override
    public Building getBuildingById(int id) throws BuildingNotFoundException {
        Building building;
        Optional<Building> op = buildingRepo.findById(id);

        if(op.isPresent()) {
            building = op.get();
        }else{
            throw new BuildingNotFoundException("Building not found");
        }
        return building;
    }

    @Override
    public List<Building> getBuildingByLocation(int locationId){
        return buildingRepo.findByLocationIdEquals(locationId);
    }

    @Override
    public Building updateBuilding(Building building) throws BuildingNotFoundException {

        Optional<Building> op = buildingRepo.findById(building.getBuildingId());
        if (!op.isPresent())
            throw new BuildingNotFoundException();
        Building oldBuilding = op.get();
        if (building.getAddress() != null)
            oldBuilding.setAddress(building.getAddress());
        return buildingRepo.save(oldBuilding);
    }

    @Override
    public boolean deleteBuildingById(int id) {
        try {
            this.buildingRepo.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
