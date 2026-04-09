import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie class reused from UC7
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
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("============================================");

        // Step 1: Create the original list of bogies (reused from UC7)
        List<Bogie> bogieList = new ArrayList<>();
        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("General", 90));

        // Step 2: Display all bogies before filtering
        System.out.println("\nAll Bogies:");
        for (Bogie bogie : bogieList) {
            System.out.println(bogie);
        }

        // Step 3: Use Stream API to filter bogies with capacity > 60
        List<Bogie> filteredBogies = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Step 4: Display filtered bogies
        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie bogie : filteredBogies) {
            System.out.println(bogie);
        }

        System.out.println("\nUC8 filtering completed...");
    }
}