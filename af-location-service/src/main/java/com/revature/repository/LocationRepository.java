package com.revature.repository;

import com.revature.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface LocationRepository extends JpaRepository <Location, Integer> {
}
