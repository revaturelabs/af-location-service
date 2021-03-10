package com.revature.repository;


import com.revature.dto.BuildingDto;
import com.revature.model.Building;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends JpaRepository<Building,Integer> {

	@Query("select b from Building b where b.location.id= ?1")
	List<BuildingDto> findAllBuildingsByLocationId(Integer id);
}
