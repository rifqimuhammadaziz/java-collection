package collection.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapApp {
    public static void main(String[] args) {
        /**
         * IdentityHashMap
         * If the value of 2/more map is same, it considered different data
         * But the common HashMap if 2 data with same value, it considered the same data
         */

        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first; // name.first
        System.out.println(key1.equals(key2)); // compare value
        System.out.println(key1 == key2); // compare memory address

        map.put(key1, "Xenosty");
        map.put(key2, "Xenosty");
        System.out.println(map.size()); // 2
    }
}
