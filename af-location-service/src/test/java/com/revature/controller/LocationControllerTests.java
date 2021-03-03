package com.revature.controller;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.revature.dto.BuildingDto;
import com.revature.service.LocationService;

public class LocationControllerTests {
	
	private LocationService ls;	
	
	@Test
	public void checkGetBuildingsAtLocationController() {
		List<BuildingDto> list =  ls.getAllBuildings();
		assertNotNull(list);
		assertEquals(list.getClass().equals(BuildingDto.class),"building classes are not the same");
	}
}
