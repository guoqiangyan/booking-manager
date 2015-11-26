package cz.muni.fi.pa165.service;

import cz.muni.fi.pa165.dao.RoomDao;
import cz.muni.fi.pa165.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Jana Cechackova
 */
@Service("roomService")
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomDao roomDao;

    @Override
    public void addRoom(Room room) {
        roomDao.addRoom(room);
    }

    @Override
    public void deleteRoom(Room room) {
        roomDao.deleteRoom(room);
    }

    @Override
    public void updateRoom(Room room) {
        roomDao.updateRoom(room);
    }

    @Override
    public Room getRoomDtoById(Long id) {
        return roomDao.getRoomById(id);
    }
}