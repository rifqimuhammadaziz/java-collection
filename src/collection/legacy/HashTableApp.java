package collection.legacy;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        // synchronized
        Map<String, String> map = new Hashtable<>();
        map.put("A", "Rifqi");
        map.put("B", "Bagas");
        map.put("C", "Bayu");
        map.put("D", "Kurnia");
        map.put("E", "Dimas");

        for (var key : map.keySet()) {
            System.out.println(key);
        }
    }
}
