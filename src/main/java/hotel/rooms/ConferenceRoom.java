package hotel.rooms;

public class ConferenceRoom extends Room {

    private String name;
    private Boolean projector;

    public ConferenceRoom(int capacity, String name, Boolean projector) {
        super(capacity);
        this.name = name;
        this.projector = projector;
    }

    public String getName() {
        return name;
    }

    public Boolean getProjector() {
        return projector;
    }
}
