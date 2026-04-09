import java.util.LinkedHashSet;

public class trainconsistmanagementapp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies");
        System.out.println("========================================");

        // Step 1: Create a LinkedHashSet to store bogies in insertion order
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Step 2: Add bogies in the order they are attached
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Step 3: Attempt to add a duplicate bogie — will be ignored automatically
        trainFormation.add("Sleeper"); // Duplicate — ignored silently

        // Step 4: Display the final train formation
        System.out.println("\nFinal Train Formation:");
        System.out.println(trainFormation);

        // Step 5: Note about LinkedHashSet behaviour
        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}