package legacy;

import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        // ArrayList is faster but not secure if running on parallel (potential to race condition)
        // Vector is slower but secure if running on parallel (synchronized)
        List<String> list = new Vector<>();
        list.add("Rifqi");
        list.add("Muhammad");
        list.add("Aziz");

        for (var value : list) {
            System.out.println(value);
        }
    }
}
