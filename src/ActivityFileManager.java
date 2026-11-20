import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

    public class ActivityFileManager {

        private Gson gson = new Gson();

        public void saveActivity(Activity activity) {

            try (FileWriter writer = new FileWriter("activities.json", true)) { //

                gson.toJson(activity, writer);

                writer.write(System.lineSeparator());


                System.out.println("Activity saved to file!");

            } catch (IOException e) {
                System.out.println("Error saving activity: " + e.getMessage());
            }
        }
        }



