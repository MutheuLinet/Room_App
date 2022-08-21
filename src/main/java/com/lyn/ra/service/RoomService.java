package com.lyn.ra.service;

import com.lyn.ra.model.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
  private static List<Room> rooms = new ArrayList<>();

  static{
    for(int i=0;i<10;i++){
      rooms.add(new Room(i, "Room " + i, "R"+i, "Q"));
    }
  }

  public List<Room> getAllRooms(){
    return rooms;
  }
}
