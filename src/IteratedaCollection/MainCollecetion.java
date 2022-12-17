package IteratedaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MainCollecetion {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        // menambah
        names.add("Susilo");
        names.add("Umi");
        names.add("Bambang");
        names.addAll(Arrays.asList("Sri","Ahmad","Kezia"));
        System.out.println(names.contains("ahmad"));
        names.remove("Susilo");
        names.removeAll(Arrays.asList("Sri","ahmad"));
        //loop data
        for(String name : names){
            System.out.println(name);
        }
        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person(3,"adi","medan"));
        persons.add(new Person(5,"Siti","Semarang"));
        persons.add(new Person(6,"Sikus","Bandung"));
        persons.addAll(Arrays.asList(new Person(7,"Minantu","Laos")));
        persons.addAll(Arrays.asList(
                new Person(8,"poi","kinabalu"),
                new Person(9,"Kimlat","Vietnam")
        ));
        /*
        masih bingung untuk menghapus ini
        persons.removeAll(Arrays.asList(
            new Person (3,"adi","medan)
        ));
        System.out.println(persons.contains(new Person(5,"Siti","Semarang")));
        */

        for (Person p : persons){
            System.out.println(p);
        }

    }
}
