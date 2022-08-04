package hotel;

import hotel.rooms.Bedroom;
import hotel.rooms.ConferenceRoom;
import hotel.rooms.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public ArrayList<Bedroom> getBedrooms() {
        return bedrooms;
    }

    public ArrayList<ConferenceRoom> getConferenceRooms() {
        return conferenceRooms;
    }

    public void checkGuestIn(Guest guest, Bedroom bedroom) {
        if (bedroom.getNumberOfGuests() < bedroom.getCapacity()) {
            bedroom.addGuestToRoom(guest);
        }
    }

    public void checkGuestOut(Guest guest, Room room) {
        if (room.getGuests().contains(guest)) {
            room.removeGuestFromRoom(guest);
        }
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }


    public Booking bookRoom(Bedroom bedroom, int numberOfNights) {
        Booking booking = new Booking(bedroom, numberOfNights);
        return booking;
    }
}

