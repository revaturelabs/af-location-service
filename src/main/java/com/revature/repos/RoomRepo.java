package com.revature.repos;

import com.revature.entities.Room;
import com.revature.entities.RoomType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


@Component
@Repository
public interface RoomRepo extends CrudRepository<Room, Integer> {
    List<Room> findRoomByBuildingId(int buildingId);
    List<Room> findRoomByTypeAndBuildingId(RoomType type, int buildingId);
    @Query("FROM Room r WHERE r.type = 'VIRTUAL'")
    List<Room> findVirtualRooms();
}
