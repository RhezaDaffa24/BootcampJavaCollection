package IteratedaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Siti","Ari","Aku","kitsa","kita"));
        System.out.println(names);
        names.set(0,"Parno");
        names.set(4,"Lolo");
        System.out.println(names);

        List<Person> persons = new ArrayList<>(
                Arrays.asList(
                        new Person(1,"koko","jakarta"),
                        new Person(2,"kiki","MAroko"),
                        new Person(3,"popo","makasar")
                )
        );
        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Index ke "+i+" : "+persons.get(i));
        }
        System.out.println(persons);
        persons.set(2,new Person(2,"laski","india"));
        for (int i = 0; i < persons.size(); i++) {
            System.out.println("Index ke "+i+" : "+persons.get(i));
        }
    }
}
