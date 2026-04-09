import java.util.ArrayList;
import java.util.List;

// GoodsBogie class with type and cargo fields
class GoodsBogie {
    String type;   // e.g., Cylindrical, Open, Box
    String cargo;  // e.g., Petroleum, Coal, Grain

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " -> " + cargo;
    }
}

public class trainconsistmanagementapp {

    public static void main(String[] args) {

        System.out.println("============================================");
        System.out.println(" UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("============================================");

        // Step 1: Create a list of goods bogies with type and cargo
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // Valid
        goodsBogies.add(new GoodsBogie("Open", "Coal"));             // Valid (non-cylindrical)
        goodsBogies.add(new GoodsBogie("Box", "Grain"));             // Valid (non-cylindrical)
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));      // INVALID — violates safety rule

        // Step 2: Display all goods bogies
        System.out.println("\nGoods Bogies in Train:");
        for (GoodsBogie bogie : goodsBogies) {
            System.out.println(bogie);
        }

        // Step 3: Apply safety rule using allMatch()
        // Rule: Cylindrical bogies must carry only Petroleum
        boolean isSafetyCompliant = goodsBogies.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        // Step 4: Display safety compliance result
        System.out.println("\nSafety Compliance Status: " + isSafetyCompliant);
        if (isSafetyCompliant) {
            System.out.println("Train Formation is SAFE.");
        } else {
            System.out.println("Train Formation is NOT SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}