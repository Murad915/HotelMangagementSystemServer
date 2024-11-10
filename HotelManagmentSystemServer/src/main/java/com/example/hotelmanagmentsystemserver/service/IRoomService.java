package com.example.hotelmanagmentsystemserver.service;

import com.example.hotelmanagmentsystemserver.model.Room;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IRoomService {

    Room addNewRoom( String roomType, BigDecimal roomPrice) throws SQLException, IOException;

    List<String> getAllRoomTypes();

    List<Room> getAllRooms();

    void deleteRoom(Long roomId);

    Room updateRoom(Long roomId, String roomType, BigDecimal roomPrice);

    Optional<Room> getRoomById(Long roomId);
}
