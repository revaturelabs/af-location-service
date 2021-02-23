package com.revature.model;

import com.revature.statics.RoomOccupation;
import com.revature.statics.RoomType;

public class Room {

    private int id;
    private String name;
    private RoomType type;
    private RoomOccupation occupation;
    private int capacity;
    private Building building;

}
