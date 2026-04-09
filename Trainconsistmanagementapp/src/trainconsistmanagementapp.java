import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class with name and capacity fields
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString for clean display
    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class trainconsistmanagementapp {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("========================================");

        // Step 1: Create a List of Bogie objects
        List<Bogie> bogieList = new ArrayList<>();

        // Step 2: Add passenger bogies with their seating capacities
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("General", 90));

        // Step 3: Display bogies before sorting
        System.out.println("\nBefore Sorting:");
        for (Bogie bogie : bogieList) {
            System.out.println(bogie);
        }

        // Step 4: Sort bogies by capacity in ascending order using Comparator
        bogieList.sort(Comparator.comparingInt(bogie -> bogie.capacity));

        // Step 5: Display bogies after sorting
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie bogie : bogieList) {
            System.out.println(bogie);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}