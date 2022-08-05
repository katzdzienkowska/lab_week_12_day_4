import hotel.Booking;
import hotel.rooms.Bedroom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(2, RoomType.DOUBLE, 75.00);
        booking = new Booking(bedroom, 3);
    }

    @Test
    public void bookingHasBedroom() {
        assertEquals(bedroom, booking.getBedroom());
    }

    @Test
    public void bookingHasNumberOfNights(){
        assertEquals(3, booking.getNumberOfNights());
    }

    @Test
    public void canCalculateTotalBill() {
        assertEquals(225.00, booking.totalBill(), 0.0);
    }

}
