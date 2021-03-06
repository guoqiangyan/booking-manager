package cz.muni.fi.pa165.dto;

import java.util.Collection;

/**
 * Data transfer object for <i>customer</i> item.
 *
 * @author Ivo Hradek
 */
public class CustomerDto {
    private Long id;
    private String forename;
    private String surname;
    private String email;
    private String password;
    private boolean isAdmin;
    private Collection<BookingDto> bookings;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Collection<BookingDto> getBookings() {
        return bookings;
    }

    public void setBookings(Collection<BookingDto> bookings) {
        this.bookings = bookings;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomerDto)) return false;

        final CustomerDto customer = (CustomerDto) o;

        return customer.getId().equals(getId()) &&
                customer.getSurname().equals(getSurname()) &&
                customer.getBookings().equals(getBookings()) &&
                customer.getForename().equals(getForename());
    }

    @Override
    public int hashCode() {
        int result;
        result = (null == getForename()) ? 0 : getForename().hashCode();
        result = 19 * result + ((null == getSurname()) ? 0 : getSurname().hashCode());
        return result;
    }
}
