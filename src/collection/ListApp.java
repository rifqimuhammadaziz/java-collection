package collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        // Default capacity is 10
        List<String> strings = new ArrayList<>();

        // Add data to list
        strings.add("Rifqi");
        strings.add("Muhammad");
        strings.add("Aziz");

        // Change/Set data by index
        strings.set(0, "Xenosty"); // Rifqi > Xenosty

        // Remove data by index
        strings.remove(0); // Remove Xenosty

        // Get data by index
        System.out.println(strings.get(0)); // Index0: Muhammad, Index1: Aziz

        // Get all data
        for (var value : strings) {
            System.out.println(value);
        }

    }
}
