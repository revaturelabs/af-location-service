package project.aflocationservice.service;

import com.revature.model.Building;
import com.revature.model.Location;
import com.revature.model.Room;
import com.revature.repository.RoomRepository;
import com.revature.service.RoomService;
import com.revature.statics.RoomOccupation;
import com.revature.statics.RoomType;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class RoomServiceTests {

    RoomRepository roomRepository;
    Location testLocation1;
    Location testLocation2;
    Building testBuilding1;
    Building testBuilding2;
    Room testRoom1;
    Room testRoom2;
    Room testRoom3;
    Room testRoom4;
    Room testRoom5;
    Room testRoom6;
    List<Room> building1Rooms;
    List<Room> building2Rooms;
    List<Room> allRooms;
    RoomService roomService;


    @Before
    public void setUp() {
        testBuilding1 = new Building ( 1, "Test City", "Test Address", testLocation1, building1Rooms );
        building1Rooms = new ArrayList<> ();
        testRoom1 = new Room ( 1, "test room 1", RoomType.VIRTUAL, RoomOccupation.TRAINING, 20, testBuilding1 );
        testRoom2 = new Room ( 2, "test room 2", RoomType.VIRTUAL, RoomOccupation.TRAINING, 20, testBuilding1 );
        testRoom3 = new Room ( 3, "test room 3", RoomType.VIRTUAL, RoomOccupation.TRAINING, 20, testBuilding1 );
        testRoom4 = new Room ( 4, "test room 4", RoomType.VIRTUAL, RoomOccupation.TRAINING, 20, testBuilding2 );
        testRoom5 = new Room ( 5, "test room 4", RoomType.VIRTUAL, RoomOccupation.TRAINING, 20, testBuilding2 );
        testRoom6 = new Room ( 6, "test room 6", RoomType.VIRTUAL, RoomOccupation.TRAINING, 20, testBuilding2 );
        building1Rooms.addAll ( Arrays.asList ( testRoom1, testRoom2, testRoom3 ) );
        building2Rooms.addAll ( Arrays.asList ( testRoom4, testRoom5, testRoom6 ) );
        allRooms.addAll ( Arrays.asList ( testRoom1, testRoom2, testRoom3, testRoom4, testRoom5, testRoom6 ) );


        roomRepository = mock ( RoomRepository.class );

        roomService = new RoomService ( roomRepository );

        //FIXME: add getRoomBy Id method to repository & Service then map to controller
        when ( roomRepository ).findRoomsByBuildingId ( testBuilding1.getId () ).thenReturn ( building1Rooms );
        when ( roomRepository ).findRoomsByBuildingId ( testBuilding2.getId () ).thenReturn ( building2Rooms );
        when ( roomRepository ).findAll ().thenReturn ( allRooms );


    }


    @Test
    public void whenSearchingForRoomsByBuilding_ExpectedListOfRoomsIsReturned() {

        assertEquals ( building1Rooms, roomService.findRoomsByBuildingId ( testBuilding1.getId () ) );
        assertEquals ( building2Rooms, roomService.findRoomsByBuildingId ( testBuilding2.getId () ) );


    }

    @Test
    public void whenRequestingAllRooms_ALlRoomsReturned() {
        assertEquals ( allRooms, roomService.getAlLRooms () );

    }

    @Test
    public void whenRequestingMeetingRooms_OnlyRooms() {

    }

}
