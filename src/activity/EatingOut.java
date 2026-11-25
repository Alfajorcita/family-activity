package activity;

public class EatingOut extends Activity {

    public EatingOut(String name, String place,
                     FreeStatus isFree,
                     int numberOfParticipants,
                     TransportMode type) {

        super(name, place, isFree, numberOfParticipants, type);
    }
}

/*
    activity.Activity eatingOut1 = new activity.EatingOut("Eating Out", "IKEA - Barkaby", );
    activity.Activity eatingOut2 = new activity.EatingOut("Eating Out", "MIDPOINT-Spånga", false);
    activity.Activity eatingOut3 = new activity.EatingOut("Eating picninc ", "Differents parks", true);
    activity.Activity eatingOut4 = new activity.EatingOut("Eating Out", "Meraba", false);
    activity.Activity eatingOut5 = new activity.EatingOut("Eating Out", "in our garden", true);
*/