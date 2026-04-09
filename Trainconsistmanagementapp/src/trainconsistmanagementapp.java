import java.util.ArrayList;
import java.util.List;

public class trainconsistmanagementapp {

    public static void main(String[] args) {
        // Print welcome message
        System.out.println("==========================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("==========================================");
        System.out.println();

        // Initialize train consist as an empty ArrayList
        List<String> trainConsist = new ArrayList<>();

        // Display initialization status
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);
        System.out.println();

        // Indicate system is ready
        System.out.println("System ready for operations...");
    }
}
