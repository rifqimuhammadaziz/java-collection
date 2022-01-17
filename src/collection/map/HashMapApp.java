package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        /**
         * Map (Key : Value)
         */

        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Rifqi");
        map.put("name.middle", "Muhammad");
        map.put("name.last", "Aziz");
        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
}
