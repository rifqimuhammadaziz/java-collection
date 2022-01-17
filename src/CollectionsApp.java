import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {

        // create mutable list
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord"));

        System.out.println(list);

        // reverse list
        Collections.reverse(list);
        System.out.println(list);

        // shuffle/random order
        Collections.shuffle(list);
        System.out.println(list);;
    }
}
