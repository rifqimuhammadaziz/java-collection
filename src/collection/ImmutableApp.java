package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Data 1");
        List<String> empty = Collections.emptyList();
        List<String> mutable = new ArrayList<>();
        mutable.add("Rifqi");
        mutable.add("Muhammad");
        mutable.add("Aziz");

        // Create immutable list from mutable list (cannot be changed)
        List<String> immutable = Collections.unmodifiableList(mutable);

        // immutable.add("Add new data"); // ERROR

        // Create Immutable list (cannot be changed/added after declared)
        List<String> elements = List.of("Rifqi", "Muhammad", "Aziz");

        // ERROR (UnsupportedOperation)
        // elements.add("Add new data");
        // elements.set(0, "Xenosty");

        System.out.println(elements);
    }
}
