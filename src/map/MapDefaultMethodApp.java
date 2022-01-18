package map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("A", "Rifqi");
        map.put("B", "Bagas");
        map.put("C", "Kurnia");
        map.put("D", "Dimas");
        map.put("E", "Bayu");

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });
    }
}
