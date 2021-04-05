package com.revature.repos;

import com.revature.entities.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Component
@Repository
public interface RoomRepo extends CrudRepository<Room, Integer> {
    List<Room> findRoomByBuildingId(int buildingId);
}
