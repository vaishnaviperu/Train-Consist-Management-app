import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class trainconsistmanagementapp {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code");
        System.out.println("============================================");

        Scanner scanner = new Scanner(System.in);

        // Step 1: Accept user input for Train ID and Cargo Code
        System.out.print("\nEnter Train ID (Format: TRN-1234): ");
        String trainID = scanner.nextLine().trim();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine().trim();

        // Step 2: Define regex patterns
        // Train ID: "TRN-" followed by exactly 4 digits
        Pattern trainIDPattern = Pattern.compile("TRN-\\d{4}");

        // Cargo Code: "PET-" followed by exactly 2 uppercase letters
        Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");

        // Step 3: Create Matcher objects for each input
        Matcher trainIDMatcher = trainIDPattern.matcher(trainID);
        Matcher cargoCodeMatcher = cargoCodePattern.matcher(cargoCode);

        // Step 4: Validate using matches() and display results
        boolean isTrainIDValid = trainIDMatcher.matches();
        boolean isCargoCodeValid = cargoCodeMatcher.matches();

        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainIDValid);
        System.out.println("Cargo Code Valid: " + isCargoCodeValid);

        scanner.close();

        System.out.println("\nUC11 validation completed...");
    }
}