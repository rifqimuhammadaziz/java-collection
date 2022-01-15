package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        /**
         * Collection : Dynamic size of data (not fix like an array)
         */

        // Add data to collection
        Collection<String> collection = new ArrayList<>();
        collection.add("Rifqi");
        collection.add("Muhammad");
        collection.add("Aziz");
        collection.addAll(List.of("Xenosty", "Theord"));

        for (var value : collection) {
            System.out.println(value);
        }

        // Remove data from collection
        System.out.println("REMOVE COLLECTION");
        collection.remove("Rifqi"); // remove one data
        collection.removeAll(List.of("Xenosty", "Theord")); // remove list of data

        for (var value : collection) {
            System.out.println(value);
        }

        // Check data
        System.out.println(collection.contains("Rifqi"));
        System.out.println(collection.contains("Muhammad"));
        System.out.println(collection.contains("Aziz"));
        System.out.println(collection.containsAll(List.of("Xenosty", "Theord")));

        // Get size
        System.out.println(collection.size());
    }
}
