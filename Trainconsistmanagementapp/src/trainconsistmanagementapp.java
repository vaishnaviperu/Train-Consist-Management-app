import java.util.HashMap;
import java.util.Map;

public class trainconsistmanagementapp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("========================================");

        // Step 1: Create a HashMap to associate bogie names with their capacities
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Step 2: Insert bogie-capacity pairs using put()
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 56);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 120);

        // Step 3: Display all bogie-capacity details using entrySet() iteration
        System.out.println("\nBogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}