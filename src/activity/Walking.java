package activity;

public class Walking extends Activity {

        public Walking(String name, String place,
                       FreeStatus isFree,
                       int numberOfParticipants,
                       TransportMode type) {

            super(name, place, isFree, numberOfParticipants, type);
        }
    }
    /*
    activity.Activity walking1 = new activity.Walking("activity.Walking", "Spånga Centrum", true);
    activity.Activity walking2 = new activity.Walking("activity.Walking", "Stäket", false);
    activity.Activity walking3 = new activity.Walking("activity.Walking", "Park", true);
    activity.Activity walking4 = new activity.Walking("activity.Walking", "Görväln NaturReservat", false);
    activity.Activity walking5 = new activity.Walking("activity.Walking", "in the city", false);
    activity.Activity walking6 = new activity.Walking("activity.Walking", "Säby gårds", false);

     */

