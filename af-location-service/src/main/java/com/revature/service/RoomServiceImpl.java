package com.revature.service;

import com.revature.dto.RoomDetailsDto;
import com.revature.dto.RoomDto;
import com.revature.model.Room;
import com.revature.repository.RoomRepository;
import com.revature.statics.RoomOccupation;
import com.revature.statics.RoomType;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;


    public RoomServiceImpl( RoomRepository roomRepository ) {
        this.roomRepository = roomRepository;
    }


    @Override
    public RoomDetailsDto getRoom( int i ) {
        Optional<Room> roomOptional = roomRepository.findById ( i );
        RoomDetailsDto detailsDto = new RoomDetailsDto ();

        if ( roomOptional.isPresent () ) {
             Room   room = roomOptional.get ();

            detailsDto.setCapacity ( room.getCapacity () );
            detailsDto.setFloorNumber ( room.getFloorNumber () );
            detailsDto.setName ( room.getName () );
            detailsDto.setType ( room.getType ().toString () );

            Set<String> roomAmenities = room.getRoomAmenities ();
            detailsDto.setAmenities ( roomAmenities  );


            return detailsDto;

        }


        return detailsDto;
    }

    @Override
    public List<RoomDto> getPhysicalMeetingRooms() {
        List<RoomDto> physicalMeetingRooms = new ArrayList<> ();


        roomRepository.findByTypeAndOccupation ( RoomType.PHYSICAL, RoomOccupation.MEETING ).forEach ( room -> {
            RoomDto roomDto = new RoomDto ();
            roomDto.setOccupation (  room.getOccupation ().name ());
            roomDto.setType( room.getType ().name ());
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


}