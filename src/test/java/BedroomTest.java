import hotel.rooms.Bedroom;
import hotel.rooms.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(2, 123, RoomType.DOUBLE, 75.00);
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(123, bedroom.getRoomNumber());
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void hasNightlyRate() {
        assertEquals(75.00, bedroom.getNightlyRate(), 0.0);
    }
}
