package collection.map;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMapApp {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP, OWNER
    }

    /**
     * EnumMap
     * Create key map from Enum (optimal distributed key compared with HashSet)
     * @param args
     */

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Level1");
        map.put(Level.STANDARD, "Level2");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
