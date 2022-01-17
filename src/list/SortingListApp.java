package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingListApp {
    public static void main(String[] args) {

        System.out.println("===== Ascending Sorting =====");
        // mutable
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord"));

        // sorting list (ascending letter)
        Collections.sort(list);
        for (var value : list) {
            System.out.println(value);
        }

        System.out.println("===== Descending Sorting using Comparator =====");

        // create comparator to descending sorting
        Comparator<String> reverse = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        // sort using comparator
        Collections.sort(list, reverse);
        for (var value : list) {
            System.out.println(value);
        }
    }
}
