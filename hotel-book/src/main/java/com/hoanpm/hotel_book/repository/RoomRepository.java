package com.hoanpm.hotel_book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoanpm.hotel_book.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long>  {
}
