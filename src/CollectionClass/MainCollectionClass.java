package CollectionClass;

import java.util.*;

public class MainCollectionClass {
    public static void main(String[] args) throws IndexOutOfBoundsException {
        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Siti","Ari","Aku","kitsa","kita"));
        System.out.println(names);
        System.out.println("\n");

        System.out.println("Saat di Balik urutannya : ");
        Collections.reverse(names);
        System.out.println(names);
        System.out.println("\n");

        System.out.println("Saat Diacak urutannya : ");
        Collections.shuffle(names);
        System.out.println(names);
        System.out.println("\n");

        System.out.println("Saat ditukar posisi : ");
        Collections.swap(names,2,0);
        System.out.println(names);
        System.out.println("\n");

//        System.out.println("Saat Dicopy ke List lain : ");
//
//        List<String> nama = new ArrayList<>(100);
//        Collections.copy(nama,names);
//        System.out.println(nama);
    }
}
