import java.util.LinkedList;

public class trainconsistmanagementapp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist");
        System.out.println("========================================");

        // Step 1: Create a LinkedList to maintain ordered bogie consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // Step 2: Add bogies in physical train sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Step 3: Display initial consist
        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // Step 4: Insert 'Pantry Car' at position 2 (between Sleeper and AC)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // Step 5: Remove the first and last bogies
        trainConsist.removeFirst(); // Removes 'Engine'
        trainConsist.removeLast();  // Removes 'Guard'

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}