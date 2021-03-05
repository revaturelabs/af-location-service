package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Room;

public interface RoomRepository extends JpaRepository<Room,Integer>{
}
