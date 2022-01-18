import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {

        List<String> list = List.of("Rifqi", "Muhammad", "Aziz", "Xenosty", "Theord", "Brozed");

        // Can be used for parallel processing (all splitter code running concurrently at one time)
        Spliterator<String> spliterator1 = list.spliterator(); // divide 2
        Spliterator<String> spliterator2 = spliterator1.trySplit(); // divide 2

        System.out.println(spliterator1.estimateSize());
        System.out.println(spliterator2.estimateSize());

        System.out.println("----- Spliterator 1 -----");
        spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("----- Spliterator 2 -----");
        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
