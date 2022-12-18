package SpliteratorInterface;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MainSpliterator {
    public static void main(String[] args) {
        List<String> names = List.of("Eko","Kurniawan","Kennedy","John","Federick","George","Courage");
        Spliterator<String> spliterator1 = names.spliterator();
        Spliterator<String> spliterator2 = spliterator1.trySplit();
        System.out.println("Yang diambil oleh spliterator1 Berjumlah: ");
        System.out.println(spliterator1.estimateSize());
        System.out.println("Yang diambil oleh spliterator2 Berjumlah: ");
        System.out.println(spliterator2.estimateSize());

        System.out.println("Yang diambil oleh spliterator1 : ");
        spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {

                System.out.print(s+"\t");
            }
        });
        System.out.println("\n");
        System.out.println("Yang diambil oleh spliterator2 : ");
        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s1) {

                System.out.print(s1+"\t");
            }
        });
    }
}
