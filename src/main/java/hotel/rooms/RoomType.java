package hotel.rooms;

public enum RoomType {

    SINGLE(1),
    DOUBLE(2),
    FAMILY(4);

    private final int numberOfBeds;

    RoomType(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }
}
