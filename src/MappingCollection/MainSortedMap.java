package MappingCollection;

import IteratedaCollection.Person;

import java.util.*;

public class MainSortedMap {
    public static void main(String[] args) {
        SortedMap<String, String> map = new TreeMap<>();

        map.put("Eko", "Eko");
        map.put("agus", "agus");
        map.put("Rosa", "Rosa");
        map.put("Agis", "Agis");
        map.put("Dibu", "Dibu");
//        Collections.unmodifiableSortedMap(map);

        map.put("Loko","Loko");

        for (var key : map.entrySet()) {
            System.out.println(key);
        }

        SortedMap<Integer, Person> map1 = new TreeMap<>();
        map1.put(3, new Person(1, "Ipul", "Kinabalu"));
        map1.put(4, new Person(2, "Lina", "Palembang"));
        map1.put(2, new Person(3, "Luna", "Jakarta"));
        map1.put(1, new Person(4, "Lani", "Bekasi"));

        for (var key1 : map1.entrySet()) {
            System.out.println(key1);
        }

        //menggunakan comparator

        SortedMap<Person, String> map2 = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });
        map2.put(new Person("Anik"), "Eko");
        map2.put(new Person("Agus"), "Agus");
        map2.put(new Person("Joko"), "Joko");

        for (var k : map2.entrySet()) {
            System.out.println(k);
        }
    }


}

