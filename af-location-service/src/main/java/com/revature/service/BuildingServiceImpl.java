package com.revature.service;

<<<<<<< HEAD
public class BuildingServiceImpl {
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repository.BuildingRepository;

@Service
public class BuildingServiceImpl implements BuildingService{

	private BuildingRepository bd;

	@Autowired
	public BuildingServiceImpl(BuildingRepository bd) {
		this.bd=bd;
	}

>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
}
