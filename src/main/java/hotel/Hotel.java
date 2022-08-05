package hotel;

import hotel.rooms.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    //private ArrayList<Room> rooms; - we could have that as well - an array list with both bedrooms and conference rooms

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

    public int getNumberOfBedrooms() {
        return bedrooms.size();
    }

    public int getNumberOfConferenceRooms() {
        return conferenceRooms.size();
    }

    // two methods below could be named both addRoom because we are passing different parameters
    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        conferenceRooms.add(conferenceRoom);
    }

    public void checkGuestInByRoom(Guest guest, Bedroom bedroom) {
        if (bedrooms.contains(bedroom) && bedroom.getNumberOfGuests() < bedroom.getCapacity()) {
            bedroom.addGuestToRoom(guest);
        }
    }

    public void checkGuestInByRoomType(Guest guest, RoomType roomType) {
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getRoomType() == roomType) {
                bedroom.addGuestToRoom(guest);
                return;
            }
        }
    }

//    public void checkGuestOut(Guest guest, Room room) {
//        if (room.getGuests().contains(guest)) {
//            room.removeGuestFromRoom(guest);
//        }
//    }

    public void checkGuestOut(Guest guest) {
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.getGuests().contains(guest)) {
                bedroom.removeGuestFromRoom(guest);
            }
        }
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

