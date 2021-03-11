package com.revature.controller;

import com.revature.dto.BuildingDto;
import com.revature.dto.LocationDetailsDto;
import com.revature.service.BuildingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.revature.service.BuildingService;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin
public class BuildingController {

	@Autowired
	private BuildingServiceImpl buildingService;

	@GetMapping("/locations/{id}/buildings")
	public List<BuildingDto> getBuildingsByLocationId(@PathVariable int id) {
		return buildingService.getBuildingsByLocation(id);
	}

}
