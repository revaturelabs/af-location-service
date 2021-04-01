package com.revature.services;


import com.revature.repos.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class RoomServiceImpl {

    @Autowired
    RoomRepo roomRepo;

    public RoomServiceImpl() {
    }

    public RoomRepo getRoomRepo() {
        return roomRepo;
    }

    public void setRoomRepo(RoomRepo roomRepo) {
        this.roomRepo = roomRepo;
    }
}
