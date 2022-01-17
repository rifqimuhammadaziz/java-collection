package collection.map;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {

        /**
         * Sorted Map (sorted by ascending letter)
         */
        System.out.println("===== Ascending Sorted Map =====");
        SortedMap<String, String> sortedMap = new TreeMap<>();
        sortedMap.put("first", "Rifqi");
        sortedMap.put("middle", "Muhammad");
        sortedMap.put("last", "Aziz");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("===== Descending Sorted Map =====");

        // Create descending comparator
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        // Descending sortedMap using comparator
        SortedMap<String, String> sortedMapDesceding = new TreeMap<>(stringComparator);
        sortedMapDesceding.put("A", "Rifqi");
        sortedMapDesceding.put("B", "Muhammad");
        sortedMapDesceding.put("C", "Aziz");
        for (var key : sortedMapDesceding.keySet()) {
            System.out.println(key);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap(); // empty sorted map
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);
        // immutable.put("new_data", "New Data"); // ERROR : can not modify immutable Map
    }
}
