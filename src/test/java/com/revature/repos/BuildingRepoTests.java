package com.revature.repos;

import com.revature.AFLocationService.AfLocationServiceApplication;
import com.revature.entities.Building;
import com.revature.entities.Location;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes= AfLocationServiceApplication.class)
public class BuildingRepoTests {

    @Autowired
    BuildingRepo buildingRepo;

    @Test
    void create_building_test(){
        Building building = new Building(0, "1234 New Building", 1);
        building = this.buildingRepo.save(building);
        Assertions.assertNotEquals(0,building.getBuildingId());
    }

    @Test
    void get_all_buildings(){
        List<Building> buildings = (ArrayList<Building>)this.buildingRepo.findAll();
        Assertions.assertTrue(buildings.size()>1);
    }

    @Test
    void get_building_by_id(){
        int id = 2;
        Building building = this.buildingRepo.findById(id).orElse(null);

        Assertions.assertNotNull(building);
        Assertions.assertEquals(id,building.getBuildingId());
    }

    @Test
    void update_building_by_id(){
        String updatedAddress = "123 Updated Address";
        Building newBuilding = new Building(1, updatedAddress,1);
        Building newBuild = this.buildingRepo.save(newBuilding);

        Assertions.assertEquals(updatedAddress, newBuild.getAddress());
    }

    @Test
    void delete_building_by_id(){
        int id = 2;
        this.buildingRepo.delete(this.buildingRepo.findById(id).orElse(null));
        Building result = this.buildingRepo.findById(id).orElse(null);
        Assertions.assertNull(result);
    }

    @Test
    void get_buildings_by_location_id(){
        int id = 1;
        List<Building> buildings = this.buildingRepo.findBuildingsByLocationId(id);
        System.out.println(buildings);
        for(Building b:buildings){
            Assertions.assertEquals(id,b.getLocationId());
        }
    }
}
