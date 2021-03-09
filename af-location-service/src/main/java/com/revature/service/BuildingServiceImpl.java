package com.revature.service;

import com.revature.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BuildingServiceImpl implements BuildingService{

	private BuildingRepository bd;

	@Autowired
	public BuildingServiceImpl( BuildingRepository bd) {
		this.bd=bd;
	}

}
