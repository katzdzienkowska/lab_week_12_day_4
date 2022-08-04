import hotel.Booking;
import hotel.Guest;
import hotel.Hotel;
import hotel.rooms.Bedroom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest1;
    Guest guest2;


    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(1, 111,RoomType .SINGLE);
        bedroom2 = new Bedroom(2, 222,RoomType .DOUBLE);
        guest1 = new Guest ("Kat");
        guest2 = new Guest ("Erik");
//        booking = hotel.bookRoom(bedroom1, 3);
    }

    @Test
    public void checkGuestInTest(){
        hotel.checkGuestIn(guest1, bedroom1);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void cannotCheckGuestInTest(){
        hotel.checkGuestIn(guest1, bedroom1);
        hotel.checkGuestIn(guest2, bedroom1);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void checkGuestOutTest(){
        hotel.checkGuestIn(guest1, bedroom1);
        hotel.checkGuestOut(guest1, bedroom1);
        assertEquals(0, bedroom1.getNumberOfGuests());
    }

    @Test
    public void canBookRoom() {
        hotel.addBedroom(bedroom1);
        Booking booking = hotel.bookRoom(bedroom1, 3);
        assertEquals(bedroom1, booking.getBedroom());
        assertEquals(3, booking.getNumberOfNights());
    }

}
