package activity;

public abstract class Activity {

    private String name;
    private String place;
    private FreeStatus isFree;
    private int numberOfParticipants;
    private TransportMode type;

    public Activity(String name, String place, FreeStatus isFree,
                    int numberOfParticipants, TransportMode type) {
        this.name = name;
        this.place = place;
        this.isFree = isFree;
        this.numberOfParticipants = numberOfParticipants;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public FreeStatus getIsFree() {
        return isFree;
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public TransportMode getType() {
        return type;
    }

}
