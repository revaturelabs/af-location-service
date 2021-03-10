package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dto.BuildingDto;
import com.revature.model.Building;
import com.revature.service.LocationService;

@RestController
@RequestMapping("location")
@CrossOrigin
public class LocationController {

	private LocationService ls;
	
	@Autowired
	public LocationController(LocationService ls) {
		this.ls=ls;
	}
	
	@GetMapping({"buildings/{id}"})	
	public ResponseEntity<List<Building>> getAllBuildingsAtLocation(@PathVariable int id){
		return new ResponseEntity(ls.findBuildingsByLocation(id),HttpStatus.OK);
		
	}
}
