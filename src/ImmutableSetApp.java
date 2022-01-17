import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> emptySet = Collections.emptySet();
        Set<String> one = Collections.singleton("Xenosty");

        Set<String> mutable = new HashSet<>();
        mutable.add("Rifqi");
        mutable.add("Aziz");
        Set<String> immutable = Collections.unmodifiableSet(mutable);
        // immutable.add("Data baru"); // ERROR : can not modify immutable set
        System.out.println(immutable);


        // Immutable set
        Set<String> set = Set.of("Rifqi", "Muhammad", "Aziz");
        // set.add("Rifqi"); // ERROR : can not duplicate data, 'Rifqi' already exist
        System.out.println(set);
        // set.remove("Rifqi"); // ERROR : can not modify immutable set
    }
}
