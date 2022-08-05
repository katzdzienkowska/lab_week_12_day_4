import hotel.Booking;
import hotel.Guest;
import hotel.Hotel;
import hotel.rooms.Bedroom;
import hotel.rooms.ConferenceRoom;
import hotel.rooms.DiningRoom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom1;
    Bedroom bedroom2;
    ConferenceRoom conferenceRoom1;
    Guest guest1;
    Guest guest2;

    DiningRoom diningRoom1;
    DiningRoom diningRoom2;


    @Before
    public void before(){
        hotel = new Hotel();
        bedroom1 = new Bedroom(111, RoomType.SINGLE, 60.00);
        bedroom2 = new Bedroom(222, RoomType.DOUBLE, 75.00);
        conferenceRoom1 = new ConferenceRoom(15, "Boardroom", true);
        guest1 = new Guest ("Kat");
        guest2 = new Guest ("Erik");
        diningRoom1 = new DiningRoom(10, "Blue Room");
        diningRoom2 = new DiningRoom(15, "Green Room");
    }

    @Test
    public void canGetBedroomCount() {
        assertEquals(0, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canGetConferenceRoomCount() {
        assertEquals(0, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void canAddBedrooms() {
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.getNumberOfBedrooms());
    }

    @Test
    public void canAddConferenceRooms() {
        hotel.addConferenceRoom(conferenceRoom1);
        assertEquals(1, hotel.getNumberOfConferenceRooms());
    }

    @Test
    public void checkGuestInByRoom(){
        hotel.addBedroom(bedroom1);
        hotel.checkGuestInByRoom(guest1, bedroom1);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void checkGuestInByRoomType(){
        hotel.addBedroom(bedroom1);
        hotel.checkGuestInByRoomType(guest1, RoomType.SINGLE);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void cannotCheckGuestInTest(){
        hotel.addBedroom(bedroom1);
        hotel.checkGuestInByRoom(guest1, bedroom1);
        hotel.checkGuestInByRoom(guest2, bedroom1);
        assertEquals(1, bedroom1.getNumberOfGuests());
    }

    @Test
    public void checkGuestOutTest(){
        hotel.addBedroom(bedroom1);
        hotel.checkGuestInByRoom(guest1, bedroom1);
        assertEquals(1, bedroom1.getNumberOfGuests());
        hotel.checkGuestOut(guest1);
        assertEquals(0, bedroom1.getNumberOfGuests());
    }

    @Test
    public void canBookRoom() {
        hotel.addBedroom(bedroom1);
        Booking booking = hotel.bookRoom(bedroom1, 3);
        assertEquals(bedroom1, booking.getBedroom());
        assertEquals(3, booking.getNumberOfNights());
    }

    @Test
    public void canAddDiningRoomToHashMap() {
        hotel.addDiningRoom(diningRoom1);
        hotel.addDiningRoom(diningRoom2);
        assertEquals(2, hotel.getNumberOfDiningRooms());
    }

}
