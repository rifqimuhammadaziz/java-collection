package collection;

import collection.data.Person;
import collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        // Sorted by ascending
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        people.add(new Person("Rifqi"));
        people.add(new Person("Bagas"));
        people.add(new Person("Kurnia"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        // Sorted by descending
        SortedSet<Person> people2 = new TreeSet<>(new PersonComparator().reversed());
        people2.add(new Person("Rifqi"));
        people2.add(new Person("Bagas"));
        people2.add(new Person("Kurnia"));

        for (var person : people2) {
            System.out.println(person.getName());
        }

        // Convert to immutable sorted set
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        // sortedSet.add(new Person("Add new human")); // ERROR : can not modify immutable set
    }
}
