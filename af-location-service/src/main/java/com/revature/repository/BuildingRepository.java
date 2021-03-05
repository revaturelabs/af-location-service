package com.revature.repository;

<<<<<<< HEAD
public interface BuildingRepository {

=======

import com.revature.model.Building;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends JpaRepository<Building,Integer> {
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
}
