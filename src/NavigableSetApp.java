import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        // Ascending set
        System.out.println("Ascending Letter");
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord"));

//        for (var name : names) {
//            System.out.println(name);
//        }

        // Descending set
        System.out.println("Descending Letter");
        NavigableSet<String> namesReverse = names.descendingSet();
//        for (var name : namesReverse) {
//            System.out.println(name);
//        }

        NavigableSet<String> rifqi = names.headSet("Rifqi", true);
        for (var name : rifqi) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("Add new data"); // ERROR : can not modify immutable set
    }
}
