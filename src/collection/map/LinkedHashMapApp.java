package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        /**
         * LinkedHashMap
         * Put data by order of input data, but retrieving data is slow, especially getting to the last data
         */

        Map<String, String> map = new LinkedHashMap<>();
        map.put("first", "Rifqi");
        map.put("last", "Aziz");
        map.put("middle", "Muhammad");

        Set<String> keys = map.keySet();
        for (var key : keys) {
            System.out.println(key);
        }
    }
}
