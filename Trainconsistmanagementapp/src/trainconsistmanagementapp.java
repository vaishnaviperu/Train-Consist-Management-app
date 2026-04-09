// Custom Runtime Exception for unsafe cargo assignments
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// GoodsBogie class with cargo assignment logic
class GoodsBogie {
    String shape;   // e.g., Cylindrical, Rectangular
    String cargo;   // assigned cargo type

    GoodsBogie(String shape) {
        this.shape = shape;
        this.cargo = null;
    }

    // Method to assign cargo with safety validation
    void assignCargo(String cargoType) {
        try {
            // Safety Rule: Petroleum must NOT be assigned to Rectangular bogies
            if (shape.equals("Rectangular") && cargoType.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }

            // Safe assignment
            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully -> " + cargoType);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Always executes — for logging or cleanup
            System.out.println("Cargo validation completed for " + shape + " bogie");
        }
    }

    @Override
    public String toString() {
        return shape + " -> " + (cargo != null ? cargo : "No cargo assigned");
    }
}

public class trainconsistmanagementapp {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println(" UC15 - Safe Cargo Assignment");
        System.out.println("============================================");

        // Test 1: Safe assignment — Cylindrical bogie with Petroleum (valid)
        GoodsBogie cylindricalBogie = new GoodsBogie("Cylindrical");
        cylindricalBogie.assignCargo("Petroleum");

        System.out.println();

        // Test 2: Unsafe assignment — Rectangular bogie with Petroleum (invalid)
        GoodsBogie rectangularBogie = new GoodsBogie("Rectangular");
        rectangularBogie.assignCargo("Petroleum");

        System.out.println("\nUC15 runtime handling completed...");
    }
}