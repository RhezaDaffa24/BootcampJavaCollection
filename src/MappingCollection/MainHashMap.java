package MappingCollection;

import IteratedaCollection.Person;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MainHashMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("firstName","Eko");
        map.put("middleName","Junaidi");
        map.put("lastName","Mustofa");
        map.put("Testing","Saiful");

        System.out.println(map.get("firstName"));
        System.out.println(map.get("middleName"));
        System.out.println(map.get("lastName"));
        System.out.println(map.get("Testing"));
        System.out.println("\n");

        // Map < type key untuk memanggil , Isi dari data>
        Map<Integer ,Person> map1 = new HashMap<>();
        map1.put(1, new Person(1,"Ipul","Kinabalu"));
        map1.put(2, new Person(2,"Lina","Palembang"));
        map1.put(3, new Person(3,"luna","Jakarta"));
        map1.put(4, new Person(4,"lani","Bekasi"));

        for (int i = 0; i <= map1.size(); i++) {
            System.out.println(map1.get(i));
        }


    }
}
