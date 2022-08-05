package hotel.rooms;

public class Bedroom extends Room{

    private int roomNumber;
    private RoomType roomType;
    private double nightlyRate;

    public Bedroom(int roomNumber, RoomType roomType, double nightlyRate) {
        super(roomType.getNumberOfBeds());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }
    // super(capacity) is not a good design above, as then we have to specify it in the test and instead of 1 or 2 we can actually put 100 - for safety

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }


    public double getNightlyRate() {
        return nightlyRate;
    }
}
