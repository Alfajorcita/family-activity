public class Walking extends Activity {

    public Walking(String name, String place, FreeStatus isFree, int numberOfParticipants, TransporMode type) {
        super(name, place, isFree, numberOfParticipants, type);
    }
}
    Activity walking1 = new Walking("Walking", "Spånga Centrum", true);
    Activity walking2 = new Walking("Walking", "Stäket", false);
    Activity walking3 = new Walking("Walking", "Park", true);
    Activity walking4 = new Walking("Walking", "Görväln NaturReservat", false);
    Activity walking5 = new Walking("Walking", "in the city", false);
    Activity walking6 = new Walking("Walking", "Säby gårds", false);

void main() {
}


