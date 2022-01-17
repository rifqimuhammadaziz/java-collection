package map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapApp {
    public static void main(String[] args) {

        /**
         * WeakHashMap, unused data (rarely accessed) will be removed by Garbage Collector
         */
        Map<Integer, Integer> map = new WeakHashMap<>();
        for (int i = 0; i < 1_000_000; i++) {
            map.put(i, i);
        }

        // Running garbage collector
        System.gc();

        System.out.println(map.size());
    }
}
