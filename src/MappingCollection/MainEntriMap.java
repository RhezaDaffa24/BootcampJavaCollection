package MappingCollection;

import IteratedaCollection.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainEntriMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Eko","Eko");
        map.put("Budi","Budi");
        map.put("Siti","Siti");
        map.put("Bedu","Bedu");

        Set<Map.Entry<String ,String>> entries = map.entrySet();

        for (var entry : entries){
            System.out.println("======");
            System.out.println("Key : "+ entry.getKey());
            System.out.println("Value : "+ entry.getValue());
        }



        Map<String, Person> personMap = new HashMap<>();
        personMap.put("orang1", new Person(1,"Ipul","Kinabalu"));
        personMap.put("orang2", new Person(2,"Lina","Palembang"));
        personMap.put("orang3", new Person(3,"luna","Jakarta"));
        personMap.put("orang4", new Person(4,"lani","Bekasi"));

        Set<Map.Entry<String ,Person>> enter = personMap.entrySet();

        for (var entry1 : enter){
            System.out.println("======");
            System.out.println("Key : "+ entry1.getKey());
            System.out.println("Value : "+ entry1.getValue());
        }

    }

}
