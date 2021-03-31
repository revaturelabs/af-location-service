package com.revature.repos;

import com.revature.entities.Building;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface BuildingRepo extends CrudRepository<Building, Integer> {
    List<Building> findBuildingsByLocationId(int id);
}
