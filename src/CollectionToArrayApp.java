import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CollectionToArrayApp {
    public static void main(String[] args) {

        List<String> names = List.of("Rifqi", "Muhammad", "Aziz");

        // convert to Array Object
        Object[] objects = names.toArray();

        // convert to String Array
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));
    }
}
