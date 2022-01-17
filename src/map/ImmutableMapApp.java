package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap(); // empty map
        Map<String, String> singleton = Collections.singletonMap("name", "xenosty"); // single map (key, value)

        // Mutable map
        Map<String, String> mutable = new HashMap<>();
        mutable.put("first", "Rifqi");
        mutable.put("middle", "Muhammad");
        mutable.put("last", "Aziz");

        // Convert mutable to immutable map
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
        // immutable.put("new_data", "New Data"); // ERROR : can not modify immutable Map

        // Define new immutable map
        Map<String, String> immutableMap = Map.of(
                "firstName", "Rifqi",
                "middleName", "Muhammad",
                "lastName", "Aziz"
        );
        // immutableMap.put("new_data", "New Data"); // ERROR : can not modify immutable Map

    }
}
