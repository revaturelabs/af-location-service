package com.revature.repository;

import com.revature.dto.BuildingDto;
import com.revature.model.Building;
import com.revature.model.Location;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

	@Query("select b from Building b where b.location.id= ?1")
	public List<Building> findBuildingsAtLocation(Integer locationId);
}
