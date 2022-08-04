package hotel;

import hotel.rooms.Bedroom;
import hotel.rooms.ConferenceRoom;
import hotel.rooms.DiningRoom;
import hotel.rooms.Room;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    private HashMap<String, DiningRoom> diningRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new HashMap<>();
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

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    public int getNumberOfBedrooms() {
        return bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return conferenceRooms.size();
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights) {
        Booking booking = new Booking(bedroom, numberOfNights);
        return booking;
    }


    public void addDiningRoom(DiningRoom diningRoom) {
        diningRooms.put(diningRoom.getName(), diningRoom);
    }

    public int getNumberOfDiningRooms() {
        return diningRooms.size();
    }
}

