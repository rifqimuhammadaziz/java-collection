package collection.map;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        // Child from SortedMap, auto sorting
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "Rifqi");
        map.put("B", "Bagas");
        map.put("C", "Kurnia");
        map.put("D", "Bayu");
        map.put("E", "Dimas");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println("Get map before key 'C' : " + map.lowerKey("C"));
        System.out.println("Get map after key 'C' : " + map.higherKey("C"));
        System.out.println("Get map before key 'C' : " + map.floorKey("C"));
        System.out.println("Get map after key 'C' : " + map.ceilingKey("C"));

        // Descending NavigableMap
        System.out.println("===== Descending Map =====");
        NavigableMap<String, String> descMap = map.descendingMap();
        System.out.println(descMap);

        // Immutable
        NavigableMap<String, String> empty = Collections.emptyNavigableMap(); // create empty immutable NavigableMap
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(descMap); // convert mutable to immutable map
        // immutable.put("new_data", "New Data"); // ERROR : can not modify immutable Map
    }
}
