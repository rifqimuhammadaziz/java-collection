package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        /**
         * BinarySearch
         * Search index of data from the list
         * The step :
         * Divide 2 of ArrayList capacity
         * Check searching data on the left or right, then divide again until data found
         *
         * Faster than Sequential Search
         */

        // Sorting ascending 1..1000
        List<Integer> list = new ArrayList<>(1000);

        for (int i = 1; i <= 1000 ; i++) {
            list.add(i);
        }

        // do binary search (list, anySearch) return index of the search
        int index = Collections.binarySearch(list, 343);
        System.out.println(index);

        // descending (search from last data)
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        int index2 = Collections.binarySearch(list, 343);
        System.out.println(index2);
    }
}
