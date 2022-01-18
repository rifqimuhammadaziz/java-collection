package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {

        /**
         * SET : Store unique data without index (data will not duplicate)
         */

        // HashSet (data printed out of order)
        Set<String> namesHashSet = new HashSet<>();
        namesHashSet.add("Rifqi");
        namesHashSet.add("Muhammad");
        namesHashSet.add("Aziz");
        namesHashSet.add("Rifqi"); // data already exist, will not be added
        namesHashSet.add("Muhammad"); // data already exist, will not be added
        namesHashSet.add("Aziz"); // data already exist, will not be added

        for (var name : namesHashSet) {
            System.out.println(name);
        }

        // LinkedHashSet (data printed by order)
        Set<String> namesLinkedHashSet = new LinkedHashSet<>();
        namesLinkedHashSet.add("Rifqi");
        namesLinkedHashSet.add("Muhammad");
        namesLinkedHashSet.add("Aziz");
        namesLinkedHashSet.add("Aziz"); // data already exist, will not be added

        for (var name : namesLinkedHashSet) {
            System.out.println(name);
        }
    }
}
