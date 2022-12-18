package LegacyCollection;

import IteratedaCollection.Person;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MainHashTable {
    public static void main(String[] args) {
        Map<String , String > map = new Hashtable<>();
        map.put("firstName","Eko");
        map.put("middleName","Junaidi");
        map.put("lastName","Mustofa");
        map.put("testing","Saiful");

        for (var p : map.entrySet()){
            System.out.println(p.getKey()+" : "+p.getValue());
        }

        Map<Integer , Person> map1 = new HashMap<>();
        map1.put(1, new Person(1,"Ipul","Kinabalu"));
        map1.put(2, new Person(2,"Lina","Palembang"));
        map1.put(3, new Person(3,"luna","Jakarta"));
        map1.put(4, new Person(4,"lani","Bekasi"));

        for (var per : map1.entrySet()){
            System.out.println(per.getKey()+" : "+per.getValue());
        }
    }
}
