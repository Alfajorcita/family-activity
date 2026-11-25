import activity.FreeStatus;
import activity.TransportMode;

public class InputHelper {

    public static FreeStatus convertFreeStatus(String answer) {

        return switch (answer.trim().toUpperCase()) {
            case "Y" -> FreeStatus.YES;
            case "N" -> FreeStatus.NO;
            case "X" -> FreeStatus.UNKNOWN;
            default -> throw new IllegalArgumentException("Invalid option");
        };
    }

    public static TransportMode convertTransportMode(String answer) {

        return TransportMode.valueOf(
                answer.trim().toUpperCase()
        );
    }
}

