public abstract class Activity {

    String name;
    String place;
    Boolean isFree;

    public Activity(String name, String place, Boolean isFree) {
        this.name = name;
        this.place = place;
        this.isFree = isFree;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public Boolean getFree() {
        return isFree;
    }
}