package SortingCollection;

import IteratedaCollection.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSorting {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("eko","eki","restu","eka","Budi","andi","carli"));

        Collections.sort(names);
        System.out.println(names);

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        List<Person> personList = new ArrayList<>();
        personList.addAll(List.of(
                new Person(1,"Rheza","Yogyakarta"),
                new Person(2,"markus","magelang"),
                new Person(3,"sirus","cialacap")
        ));
//        Collections.sort(personList);
//        System.out.println(personList);
//
//        Collections.sort(personList, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o2.compareTo(o1);
//            }
//        });
    }
}
