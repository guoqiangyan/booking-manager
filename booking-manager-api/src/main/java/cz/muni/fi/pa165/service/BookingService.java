package cz.muni.fi.pa165.service;

import cz.muni.fi.pa165.entity.Booking;

/**
 *
 * @author Jana Cechackova
 */
public interface BookingService {
    void addBooking(Booking booking);
    void deleteBooking(Booking booking);
    void updateBooking(Booking booking);
    Booking getBookingById(Long id);
}
