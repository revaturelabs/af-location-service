package com.revature.repos;

import com.revature.entities.Building;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface BuildingRepo extends CrudRepository<Building, Integer> {
}
