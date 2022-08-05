import hotel.rooms.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(15, "Boardroom", true);
    }

    @Test
    public void hasCapacity() {
        assertEquals(15, conferenceRoom.getCapacity());
    }

    @Test
    public void hasName(){
        assertEquals("Boardroom", conferenceRoom.getName());
    }

    @Test
    public void hasProjector() {
        assertEquals(true, conferenceRoom.getProjector());
    }

}
