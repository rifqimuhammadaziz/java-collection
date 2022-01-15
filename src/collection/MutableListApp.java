package collection;

import collection.data.Person;

import java.util.List;

public class MutableListApp {
    public static void main(String[] args) {

        Person person = new Person("Xenosty");

        person.addHobby("Playing Dota");
        person.addHobby("Playing CSGO");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        // hobbies.add("AWS"); // Cannot change data (Immutable)
    }
}
