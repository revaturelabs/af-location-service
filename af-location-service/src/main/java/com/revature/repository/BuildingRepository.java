package com.revature.repository;

import com.revature.model.Building;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuildingRepository extends JpaRepository <Building, Integer> {
}
