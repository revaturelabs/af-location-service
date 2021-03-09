package com.revature.service;

import com.revature.dto.RoomDetailsDto;
import com.revature.dto.RoomDto;
import com.revature.dto.RoomRequestDto;
import com.revature.model.Room;
import com.revature.repository.RoomRepository;
import com.revature.statics.RoomOccupation;
import com.revature.statics.RoomType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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
            Room room = roomOptional.get ();

            detailsDto.setCapacity ( room.getCapacity () );
            detailsDto.setFloorNumber ( room.getFloorNumber () );
            detailsDto.setName ( room.getName () );
            detailsDto.setType ( room.getType ().toString () );

            Set<String> roomAmenities = room.getRoomAmenities ();
            detailsDto.setAmenities ( roomAmenities );


            return detailsDto;

        }


        return detailsDto;
    }

    @Override
    public List<RoomDto> getPhysicalMeetingRooms() {
        List<RoomDto> physicalMeetingRooms = new ArrayList<> ();


        roomRepository.findByTypeAndOccupation ( RoomType.PHYSICAL, RoomOccupation.MEETING ).forEach ( room -> {
            RoomDto roomDto = mapDto ( room );
            physicalMeetingRooms.add ( roomDto );
        } );

        return physicalMeetingRooms;
    }

    private RoomDto mapDto( Room room ) {
        RoomDto roomDto = new RoomDto ();
        roomDto.setId ( room.getRoomId () );
        roomDto.setOccupation ( room.getOccupation ().name () );
        roomDto.setType ( room.getType ().name () );
        return roomDto;
    }

    @Override
    public List<RoomDto> getPhysicalTrainingRooms() {
        List<RoomDto> physicalTrainingRooms = new ArrayList<> ();
        roomRepository.findByTypeAndOccupation ( RoomType.PHYSICAL, RoomOccupation.TRAINING ).forEach ( room -> {
            RoomDto roomDto = mapDto ( room );
            physicalTrainingRooms.add ( roomDto );
        } );
        return physicalTrainingRooms;
    }

    @Override
    public List<RoomDto> getRemoteRooms() {
        List<RoomDto> remoteRooms = new ArrayList<> ();
        roomRepository.findByType ( RoomType.REMOTE ).forEach ( room -> {
            RoomDto roomDto = mapDto ( room );
            remoteRooms.add ( roomDto );
        } );

        return remoteRooms;
    }

    @Override
    public List<RoomDto> getPhysicalRooms() {
        List<RoomDto> physicalRooms = new ArrayList<> ();
        roomRepository.findByType ( RoomType.PHYSICAL ).forEach ( room -> {
            RoomDto roomDto = mapDto ( room );
            physicalRooms.add ( roomDto );
        } );
        return physicalRooms;
    }

    @Override
    public List<RoomDto> getVirtualRooms() {
        List<RoomDto> virtualRooms = new ArrayList<> ();
        roomRepository.findByType ( RoomType.VIRTUAL ).forEach ( room -> {
            RoomDto roomDto = mapDto ( room );
            virtualRooms.add ( roomDto );
        } );
        return virtualRooms;
    }

    @Override
    public List<RoomDto> getMeetingRooms() {
        List<RoomDto> meetingRooms = new ArrayList<> ();
        roomRepository.findByOccupation ( RoomOccupation.MEETING ).forEach ( room -> {
            RoomDto roomDto = mapDto ( room );
            meetingRooms.add ( roomDto );
        } );
        return meetingRooms;
    }

    @Override
    public List<RoomDto> getTrainingRooms() {
        List<RoomDto> trainingRooms = new ArrayList<> ();
        roomRepository.findByOccupation ( RoomOccupation.TRAINING ).forEach ( room -> {
            RoomDto roomDto = mapDto ( room );
            trainingRooms.add ( roomDto );
        } );
        return trainingRooms;
    }

    @Override
    public List<RoomDto> getAllRooms() {

        List<RoomDto> allRooms = new ArrayList<> ();
        roomRepository.findAll ().forEach ( room -> {
            RoomDto roomDto = mapDto ( room );
            allRooms.add ( roomDto );
        } );
        return allRooms;
    }

    @Override
    public List<RoomDto> getRemoteTrainingRooms() {
        List<RoomDto> remoteTrainingRooms = new ArrayList<>();
        roomRepository.findByTypeAndOccupation ( RoomType.REMOTE, RoomOccupation.TRAINING ).forEach ( room -> {
            RoomDto roomDto = mapDto ( room );
            remoteTrainingRooms.add ( roomDto );
        } );
        return remoteTrainingRooms;
    }

    @Override
    public List<RoomDto> getRemoteMeetingRooms() {
        List<RoomDto> remoteMeetingRooms = new ArrayList<>();
        roomRepository.findByTypeAndOccupation ( RoomType.REMOTE,  RoomOccupation.MEETING).forEach ( room ->{
            RoomDto roomDto = mapDto ( room);
            remoteMeetingRooms.add(roomDto);
        });

        return remoteMeetingRooms;
    }

    @Override
    public void updateName( int id, String name ) {

    }

    @Override
    public void updateRoomType( int id, String type ) {

    }

    @Override
    public void updateCapacity( int id, int capacity ) {

    }

    @Override
    public void removeAmenity( int id, String amenity ) {

    }

    @Override
    public void addAmenity( int id, String amenity ) {

    }

    @Override
    public void deleteRoom( int id ) {

    }

    @Override
    public void updateRoom( int id, RoomRequestDto roomRequestDto ) {

    }


}