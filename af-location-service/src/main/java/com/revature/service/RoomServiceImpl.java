package com.revature.service;

<<<<<<< HEAD
import com.revature.dto.RoomDetailsDto;
import com.revature.dto.RoomDto;
import com.revature.model.Room;
import com.revature.repository.RoomRepository;
import com.revature.statics.RoomOccupation;
import com.revature.statics.RoomType;
import lombok.Data;

import java.util.*;

@Data
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;


    public RoomServiceImpl(RoomRepository roomRepository){
        this.roomRepository = roomRepository;
    }


    @Override
    public RoomDetailsDto getRoom( int i ) {
        Optional<Room> roomOptional = roomRepository.findById ( i );

        if(roomOptional.isPresent ()){
            Room room = roomOptional.get ();

            RoomDetailsDto detailsDto = new RoomDetailsDto ();
            detailsDto.setCapacity ( room.getCapacity () );
            detailsDto.setFloorNumber ( room.getFloorNumber () );
            detailsDto.setName ( room.getName () );
            detailsDto.setType ( room.getType ().toString () );

            Set<String> detailsSet = new HashSet<> ();
            Map<String, Integer> roomAmenities = room.getRoomAmenities ();

            roomAmenities.forEach ( (key, value) -> {
                detailsSet.add ( key + ": "+value);

            });

            detailsDto.setAmenities ( detailsSet );
             return detailsDto;

        }



        return null;
    }

    @Override
    public List<RoomDto> getPhysicalMeetingRooms() {
        List<RoomDto> physicalMeetingRooms = new ArrayList<>();


        roomRepository.findByTypeAndOccupation ( RoomType.PHYSICAL, RoomOccupation.MEETING ).forEach ( room ->{
            RoomDto roomDto = new RoomDto ();
            roomDto.id = room.getId ();
            roomDto.capacity = room.getCapacity ();
            roomDto.name = room.getName ();
            roomDto.occupation = room.getOccupation ().name ();
            roomDto.type = room.getType ().name ();
            physicalMeetingRooms.add ( roomDto );
        } );

        return physicalMeetingRooms;
    }

    @Override
    public List<RoomDto> getPhysicalTrainingRooms() {
        return null;
    }

    @Override
    public List<RoomDto> getRemoteRooms() {
        return null;
    }

    @Override
    public List<RoomDto> getPhysicalRooms() {
        return null;
    }

    @Override
    public List<RoomDto> getVirtualRooms() {
        return null;
    }

    @Override
    public List<RoomDto> getMeetingRooms() {
        return null;
    }

    @Override
    public List<RoomDto> getTrainingRooms() {
        return null;
    }

    @Override
    public List<RoomDto> getAllRooms() {
        return null;
    }

    @Override
    public List<RoomDto> getRemoteTrainingRooms() {
        return null;
    }

    @Override
    public List<RoomDto> getRemoteMeetingRooms() {
        return null;
    }

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.repository.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService {
	
	private RoomRepository rr;
	
	@Autowired
	public RoomServiceImpl(RoomRepository rr) {
		this.rr = rr;
	}
>>>>>>> 8f12375a520c78cfe2654ef20ae39bf8d4fb937b

}
