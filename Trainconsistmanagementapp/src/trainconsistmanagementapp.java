import java.util.ArrayList;
import java.util.List;

// Bogie class reused from previous UCs
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> " + capacity;
    }
}

public class trainconsistmanagementapp {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println(" UC10 - Count Total Seats in Train");
        System.out.println("============================================");

        // Step 1: Create the list of bogies
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 70));

        // Step 2: Display all bogies
        System.out.println("\nBogies in Train:");
        for (Bogie bogie : bogieList) {
            System.out.println(bogie);
        }

        // Step 3: Use Stream map() + reduce() to compute total seating capacity
        int totalCapacity = bogieList.stream()
                .map(b -> b.capacity)           // Extract capacity from each Bogie
                .reduce(0, Integer::sum);        // Sum all capacities, starting from 0

        // Step 4: Display the total seating capacity
        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);

        System.out.println("\nUC10 aggregation completed...");
    }
}