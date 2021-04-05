package com.revature.services;

import com.revature.entities.Room;
import com.revature.exceptions.RoomNotFoundException;

import java.util.List;

public interface RoomService {

    Room createRoom(Room room);

    List<Room> getAllRooms();
    Room getRoomById(int roomId) throws RoomNotFoundException;
    List<Room> getRoomsByBuildingId(int buildingId);

    Room updateRoom(Room room) throws RoomNotFoundException;

    boolean deleteRoom(int roomId);

}
