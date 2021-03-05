package com.revature.repository;

import com.revature.model.Location;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository <Location, Integer> {
//    @Modifying
//    @Query("delete location l from locations where l.id = :id")
//    void deleteById(int id);
=======

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b
}
