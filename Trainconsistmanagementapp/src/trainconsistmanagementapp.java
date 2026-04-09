import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println(" UC13 - Performance Comparison: Loops vs Streams");
        System.out.println("============================================");

        // Step 1: Create a large dataset of bogies for benchmarking
        List<Bogie> bogieList = new ArrayList<>();
        String[] types = {"Sleeper", "AC Chair", "First Class", "General", "Pantry"};
        int[] capacities = {72, 56, 24, 90, 40};

        for (int i = 0; i < 100000; i++) {
            bogieList.add(new Bogie(types[i % types.length], capacities[i % capacities.length]));
        }

        System.out.println("\nDataset Size: " + bogieList.size() + " bogies");
        System.out.println("Filter Condition: Capacity > 60");

        // -------------------------------------------------------
        // Step 2: Loop-Based Filtering
        // -------------------------------------------------------
        long loopStart = System.nanoTime();

        List<Bogie> loopFiltered = new ArrayList<>();
        for (Bogie b : bogieList) {
            if (b.capacity > 60) {
                loopFiltered.add(b);
            }
        }

        long loopEnd = System.nanoTime();
        long loopDuration = loopEnd - loopStart;

        System.out.println("\n--- Loop-Based Filtering ---");
        System.out.println("Bogies Filtered: " + loopFiltered.size());
        System.out.println("Execution Time: " + loopDuration + " ns");

        // -------------------------------------------------------
        // Step 3: Stream-Based Filtering
        // -------------------------------------------------------
        long streamStart = System.nanoTime();

        List<Bogie> streamFiltered = bogieList.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        long streamEnd = System.nanoTime();
        long streamDuration = streamEnd - streamStart;

        System.out.println("\n--- Stream-Based Filtering ---");
        System.out.println("Bogies Filtered: " + streamFiltered.size());
        System.out.println("Execution Time: " + streamDuration + " ns");

        // -------------------------------------------------------
        // Step 4: Results Consistency Check
        // -------------------------------------------------------
        System.out.println("\n--- Result Consistency ---");
        boolean resultsMatch = loopFiltered.size() == streamFiltered.size();
        System.out.println("Loop and Stream Results Match: " + resultsMatch);

        // Step 5: Performance Summary
        System.out.println("\n--- Performance Summary ---");
        if (loopDuration < streamDuration) {
            System.out.println("Loop was faster by " + (streamDuration - loopDuration) + " ns");
        } else {
            System.out.println("Stream was faster by " + (loopDuration - streamDuration) + " ns");
        }

        System.out.println("\nUC13 performance comparison completed...");
    }
}