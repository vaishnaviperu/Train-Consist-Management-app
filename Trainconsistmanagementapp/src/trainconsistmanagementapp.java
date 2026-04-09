import java.util.HashSet;

public class trainconsistmanagementapp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs");
        System.out.println("========================================");

        // Step 1: Create a HashSet to store unique bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Step 2: Add bogie IDs — including intentional duplicates
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG104");
        bogieIDs.add("BG101"); // Duplicate — will be ignored automatically
        bogieIDs.add("BG102"); // Duplicate — will be ignored automatically

        // Step 3: Display the final set (duplicates removed automatically)
        System.out.println("\nBogie IDs After Insertion:");
        System.out.println(bogieIDs);

        // Step 4: Note about HashSet behaviour
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}