package com.example.hotelmanagmentsystemserver.service;

import com.example.hotelmanagmentsystemserver.model.BookedRoom;

import java.util.List;

public interface IBookingService {

    List<BookedRoom> getAllBookings();

    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getBookingsByUserEmail(String email);

    void cancelBooking(Long bookingId);
}
