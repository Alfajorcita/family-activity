public class EatingOut extends Activity {

    public EatingOut(String name, String place,
                     FreeStatus isFree,
                     int numberOfParticipants,
                     TransportMode type) {

        super(name, place, isFree, numberOfParticipants, type);
    }
}

/*
    Activity eatingOut1 = new EatingOut("Eating Out", "IKEA - Barkaby", );
    Activity eatingOut2 = new EatingOut("Eating Out", "MIDPOINT-Spånga", false);
    Activity eatingOut3 = new EatingOut("Eating picninc ", "Differents parks", true);
    Activity eatingOut4 = new EatingOut("Eating Out", "Meraba", false);
    Activity eatingOut5 = new EatingOut("Eating Out", "in our garden", true);
*/