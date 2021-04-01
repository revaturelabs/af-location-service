package com.revature.services;

import com.revature.entities.Building;
import com.revature.entities.Location;

import java.util.List;

public interface BuildingService {

    Building createBuilding(Building building);

    List<Building> getAllBuildings();
    Building getBuildingById(int id);
    List<Building> getBuildingByLocation(Location location);

    Building updateBuilding(Building building);

    boolean deleteBuildingById(int id);

}
