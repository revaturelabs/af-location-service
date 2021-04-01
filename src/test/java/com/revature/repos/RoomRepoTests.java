package com.revature.repos;

import com.revature.AFLocationService.AfLocationServiceApplication;
import com.revature.entities.Building;
import com.revature.entities.Room;
import com.revature.entities.RoomType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
@SpringBootTest(classes= AfLocationServiceApplication.class)
public class RoomRepoTests {

    @Autowired
    RoomRepo roomRepo;

    @Test
    void create_room_test(){
        Room room = new Room(0, "Room Name", RoomType.CLASSROOM, 50, 1);
        room = this.roomRepo.save(room);
        Assertions.assertNotEquals(0,room.getRoomId());
    }

    @Test
    void get_all_rooms(){
        List<Room> rooms = (ArrayList<Room>)this.roomRepo.findAll();
        Assertions.assertTrue(rooms.size()>1);
    }

    @Test
    void get_room_by_id(){
        int id = 2;
        Room room = this.roomRepo.findById(id).orElse(null);
        Assertions.assertEquals(id,room.getRoomId());
    }

    @Test
    void update_room_by_id(){
        String updatedRoomName = "Updated Room Name";
        Room newRoom = new Room(1, updatedRoomName, RoomType.CLASSROOM, 50, 1);
        Room newRm = this.roomRepo.save(newRoom);

        Assertions.assertEquals(updatedRoomName, newRm.getName());
    }

    @Test
    void delete_room_by_id(){
        int id = 2;
        this.roomRepo.delete(this.roomRepo.findById(id).orElse(null));
        Room result = this.roomRepo.findById(id).orElse(null);
        Assertions.assertNull(result);
    }

}
