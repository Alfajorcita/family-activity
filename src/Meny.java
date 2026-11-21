
import java.util.Scanner;
import console.ConsolePrinter;
public class Meny {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ActivityService activityService = new ActivityService();
        ActivityFileManager fileManager = new ActivityFileManager();
        String option;

        do {
            ConsolePrinter.showMainMenu();

            option = scanner.nextLine().trim();

            switch (option) {

                case "1":
                    // MENU 1.2
                    System.out.println("\n-- Add a new Activity --");
                    System.out.println("Answer the following questions.");

                    // 1. NAME
                    String name;
                    do {
                        System.out.print("Name: ");
                        name = scanner.nextLine().trim();

                        if (name.isEmpty()) {
                            System.out.println("Name cannot be empty.");
                        }

                    } while (name.isEmpty());


                    // 2. PLACE
                    String place;
                    do {
                        System.out.print("Place: ");
                        place = scanner.nextLine().trim();

                        if (place.isEmpty()) {
                            System.out.println("Place cannot be empty.");
                        }

                    } while (place.isEmpty());

                    String isFree;

                    do {
                        System.out.print("Is it free? (Y/N/X - I don't know): ");
                        isFree = scanner.nextLine().trim().toUpperCase();

                        if (!isFree.equals("Y") &&
                                !isFree.equals("N") &&
                                !isFree.equals("X")) {

                            System.out.println("Invalid option. Enter Y, N or X.");
                        }

                    } while (!isFree.equals("Y") &&
                            !isFree.equals("N") &&
                            !isFree.equals("X"));

                    FreeStatus freeStatus = InputHelper.convertFreeStatus(isFree);

                    int participants = 0;

                    do {
                        System.out.print("Number of participants: ");
                        String input = scanner.nextLine().trim();

                        try {
                            participants = Integer.parseInt(input);

                            if (participants <= 0) {
                                System.out.println("Enter a positive number.");
                            }

                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Enter a whole number.");
                        }

                    } while (participants <= 0);

                    String transportMode;

                    do {
                        System.out.println("Choose transport mode:");
                        System.out.println("Bike, Car, Foot, Bus, Subway, Another");
                        System.out.print("Transport mode: ");

                        transportMode = scanner.nextLine().trim();

                        if (!transportMode.equalsIgnoreCase("bike") &&
                                !transportMode.equalsIgnoreCase("car") &&
                                !transportMode.equalsIgnoreCase("foot") &&
                                !transportMode.equalsIgnoreCase("bus") &&
                                !transportMode.equalsIgnoreCase("subway") &&
                                !transportMode.equalsIgnoreCase("another")) {

                            System.out.println("Invalid transport mode.");
                        }

                    } while (!transportMode.equalsIgnoreCase("bike") &&
                            !transportMode.equalsIgnoreCase("car") &&
                            !transportMode.equalsIgnoreCase("foot") &&
                            !transportMode.equalsIgnoreCase("bus") &&
                            !transportMode.equalsIgnoreCase("subway") &&
                            !transportMode.equalsIgnoreCase("another"));

                    TransportMode transport = InputHelper.convertTransportMode(transportMode);

                    CustomActivity activity = new CustomActivity(
                            name,
                            place,
                            freeStatus,
                            participants,
                            transport
                    );

                    activityService.addActivity(activity);
                    fileManager.saveActivity(activity); //

                    System.out.println("Activities saved: " + activityService.activities.size());

                    System.out.println("\n-- Activity added! --");
                    System.out.println("Name: " + name + "---");
                    System.out.print("Place: " + place + "---");
                    System.out.print("Is free: " + isFree + "---");
                    System.out.print("Participants: " + participants + "---");
                    System.out.print("Transport: " + transportMode );

                    break;


                case "2":
                    System.out.println("\n-- Available Activities --");
                    activityService.showAllActivities();//llama al metodo y muestra el contenido del arraylist
                    break;

                case "3":
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please enter 1, 2 or 3.");
            }

        } while (!option.equals("3"));

        scanner.close();
    }
}
