import java.util.ArrayList;

public class trainconsistmanagementapp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train");
        System.out.println("========================================");

        // Step 1: Create an ArrayList to hold passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Step 2: Add bogies to the list
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display the list after addition
        System.out.println("\nAfter Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Step 4: Remove 'AC Chair' bogie
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Step 5: Check if 'Sleeper' exists using contains()
        System.out.println("\nChecking if 'Sleeper' exists:");
        boolean containsSleeper = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + containsSleeper);

        // Step 6: Print the final state of the list
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}