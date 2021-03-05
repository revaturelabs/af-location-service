package com.revature.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.service.LocationService;

@RestController
@RequestMapping("location")
@CrossOrigin
public class LocationController {

	private LocationService ls;
	
	public LocationController(LocationService ls) {
		this.ls=ls;
	}
}
