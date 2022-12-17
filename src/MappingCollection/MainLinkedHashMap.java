package MappingCollection;

import IteratedaCollection.Person;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainLinkedHashMap {
    public static void main(String[] args) {
        Map<String,String> map = new LinkedHashMap<>();
        map.put("Eko","Eko");
        map.put("Kurniawan","Kurniawan");
        map.put("Kennedy","Kennedy");

        for (var key : map.keySet()){
            System.out.println(key);
        }

//        Map<Integer , Person> map1 = new LinkedHashMap<>();
//        map1.put(1, new Person(1,"Ipul","Kinabalu"));
//        map1.put(2, new Person(2,"Lina","Palembang"));
//        map1.put(3, new Person(3,"luna","Jakarta"));
//        map1.put(4, new Person(4,"lani","Bekasi"));
        Map<String , Person> map1 = new LinkedHashMap<>();
        map1.put("orang1", new Person(1,"Ipul","Kinabalu"));
        map1.put("orang2", new Person(2,"Lina","Palembang"));
        map1.put("orang3", new Person(3,"luna","Jakarta"));
        map1.put("orang4", new Person(4,"lani","Bekasi"));

        // yang ditampilkan hanya key nya saja
        for (var p : map1.keySet()){
            System.out.print("\t"+p);
        }

//        for (var p : map1.get()){
//            System.out.print("\t"+p);
//        }
    }
}
