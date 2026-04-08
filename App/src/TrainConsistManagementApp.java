import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TrainConsistMgmtApp {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        // Constructor
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("==========================================\n");

        // Create List of passenger bogies
        List<Bogie> bogies = new ArrayList<>();

        // ---- ADD BOGIES ----
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 98));

        // ---- DISPLAY BEFORE SORTING ----
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ---- SORT USING COMPARATOR ----
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // ---- DISPLAY AFTER SORTING ----
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC7 sorting completed....");
    }
}