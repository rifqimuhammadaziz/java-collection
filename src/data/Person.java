package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {

    private String name;
    private List<String> hobbies;

    // Mutable (bisa berubah-ubah)
    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public List<String> getHobbies() {
        // return hobbies; MUTABLE
        return Collections.unmodifiableList(hobbies); // IMMUTABLE
    }

    public String getName() {
        return name;
    }
}
