import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Bogie class reused from UC7/UC8
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
        System.out.println(" UC9 - Group Bogies by Type");
        System.out.println("============================================");

        // Step 1: Create the list of bogies — including duplicates of same type
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Sleeper", 70));
        bogieList.add(new Bogie("AC Chair", 60));

        // Step 2: Display all bogies before grouping
        System.out.println("\nAll Bogies:");
        for (Bogie bogie : bogieList) {
            System.out.println(bogie);
        }

        // Step 3: Group bogies by their name (type) using Collectors.groupingBy()
        Map<String, List<Bogie>> groupedBogies = bogieList.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Step 4: Display grouped bogie structure
        System.out.println("\nGrouped Bogies:");
        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nBogie Type: " + entry.getKey());
            for (Bogie bogie : entry.getValue()) {
                System.out.println("  Capacity -> " + bogie.capacity);
            }
        }

        System.out.println("\nUC9 grouping completed...");
    }
}