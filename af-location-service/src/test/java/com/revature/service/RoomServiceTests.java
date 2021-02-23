package project.aflocationservice.service;

import org.junit.Before;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class RoomServiceTests {

    RoomRepository roomRepository;
    Building testBuilding1;
    Building testBuilding2;
    Room testRoom1;
    Room testRoom2;
    Room testRoom3;


    @Before
    public void setUp(){

        roomRepository = mock(RoomRepository.class);
        when(roomRepository).findRoomsByBuilding(testBuilding1).thenReturn()


    }
}
