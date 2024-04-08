package com.hoanpm.hotel_book.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

import org.springframework.web.multipart.MultipartFile;
import com.hoanpm.hotel_book.model.Room;

public interface IRoomService {
    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws SQLException, IOException;
}
