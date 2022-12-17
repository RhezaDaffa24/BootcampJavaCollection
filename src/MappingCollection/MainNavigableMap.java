package MappingCollection;

import IteratedaCollection.Person;

import java.util.Arrays;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class MainNavigableMap {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Eko","Eko");
        map.put("Budi","Budi");
        map.put("Siti","Siti");

        System.out.println(map.lowerKey("Eko"));
        System.out.println(map.higherKey("Eko"));

        NavigableMap<String, Person> persons = new TreeMap<>();

        persons.put("orang1", new Person(1,"Ipul","Kinabalu"));
        persons.put("orang2", new Person(2,"Lina","Palembang"));
        persons.put("orang3", new Person(3,"luna","Jakarta"));
        persons.put("orang4", new Person(4,"lani","Bekasi"));

        System.out.println(persons.higherKey("orang2"));
        System.out.println(persons.lowerKey("orang2"));

        // lowerkey menunjukkan si x lebih rendah dari key apa
        // higherkey menunjukkan si x lebih tinggi dari key apa
    }
}
