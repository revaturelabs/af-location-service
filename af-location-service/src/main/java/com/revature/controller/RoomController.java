package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.service.RoomService;

@RestController
@RequestMapping("/api/")
@CrossOrigin
public class RoomController {

	private RoomService rs;

	@Autowired
	public RoomController(RoomService rs) {
		this.rs=rs;
	}

}
