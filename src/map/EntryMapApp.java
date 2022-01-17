package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("A", "Rifqi");
        map.put("B", "Bagas");
        map.put("C", "Bayu");
        map.put("D", "Kurnia");
        map.put("E", "Dimas");

        System.out.println(map.keySet()); // get all key
        System.out.println(map.values()); // get all value
        System.out.println(map.entrySet()); // get map (key, value)

        // Entry is inner interface of Map
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
