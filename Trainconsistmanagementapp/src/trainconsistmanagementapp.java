// Custom Exception class for invalid bogie capacity
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// PassengerBogie class with capacity validation in constructor
class PassengerBogie {
    String type;
    int capacity;

    // Constructor throws custom exception if capacity is invalid
    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " -> " + capacity;
    }
}

public class trainconsistmanagementapp {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity");
        System.out.println("============================================");

        // Test 1: Valid capacity — bogie created successfully
        try {
            PassengerBogie validBogie = new PassengerBogie("Sleeper", 72);
            System.out.println("\nCreated Bogie: " + validBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 2: Invalid capacity (zero) — exception thrown
        try {
            PassengerBogie invalidBogie = new PassengerBogie("AC Chair", 0);
            System.out.println("Created Bogie: " + invalidBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 3: Invalid capacity (negative) — exception thrown
        try {
            PassengerBogie negativeBogie = new PassengerBogie("First Class", -10);
            System.out.println("Created Bogie: " + negativeBogie);
        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}