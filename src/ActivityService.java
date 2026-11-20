import java.util.ArrayList;
import java.util.List;

public class ActivityService {

    List<Activity>activities= new ArrayList<>();

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void showAllActivities() {

        if (activities.isEmpty()) {
            System.out.println("No activities found.");
            return;
        }

        for (Activity activity : activities) {
            System.out.println(activity.getName() + " - " + activity.getPlace());
        }
    }

}
