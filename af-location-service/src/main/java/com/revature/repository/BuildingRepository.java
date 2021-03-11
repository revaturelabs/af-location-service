package com.revature.repository;



import com.revature.model.Building;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingRepository extends JpaRepository<Building,Integer> {

	@Query("select * from building where location_id = :id")
	List<Building> findAllByLocationId(@Param(value = "id") int id);

}
