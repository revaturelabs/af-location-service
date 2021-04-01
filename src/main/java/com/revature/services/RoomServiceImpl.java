package com.revature.services;


import com.revature.entities.Room;
import com.revature.exceptions.RoomNotFoundException;
import com.revature.repos.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepo roomRepo;

//    public RoomServiceImpl() {
//    }
//
//    public RoomRepo getRoomRepo() {
//        return roomRepo;
//    }
//
//    public void setRoomRepo(RoomRepo roomRepo) {
//        this.roomRepo = roomRepo;
//    }


    @Override
    public Room createRoom(Room room) {
        return null;
    }

    @Override
    public List<Room> getAllRooms() {
        return null;
    }

    @Override
    public Room getRoomById(int roomId) throws RoomNotFoundException {
        return null;
    }

    @Override
    public List<Room> getRoomsByBuildingId(int buildingId) {
        return null;
    }

    @Override
    public Room updateRoom(Room room) throws RoomNotFoundException{
        return null;
    }

    @Override
    public boolean deleteRoom(int roomId) {
        return false;
    }
}
