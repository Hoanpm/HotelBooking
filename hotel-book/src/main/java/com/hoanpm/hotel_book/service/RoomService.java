package com.hoanpm.hotel_book.service;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;
import javax.sql.rowset.serial.SerialBlob;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hoanpm.hotel_book.model.Room;
import com.hoanpm.hotel_book.repository.RoomRepository;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor
public class RoomService implements IRoomService {
    
    private final RoomRepository roomRepository;
    @Override
    public Room addNewRoom(MultipartFile file, String roomType, BigDecimal roomPrice) throws SQLException, IOException {
        Room room = new Room();
        room.setRoomType(roomType);
        room.setRoomPrice(roomPrice);
        if (file != null) {
            byte[] photoBytes = file.getBytes();
            Blob photBlob = new SerialBlob(photoBytes);
            room.setPhoto(photBlob);
        }
        return roomRepository.save(room);
        
    } 
    
}
