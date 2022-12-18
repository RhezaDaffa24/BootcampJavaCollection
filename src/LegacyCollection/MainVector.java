package LegacyCollection;

import IteratedaCollection.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class MainVector{
    public static void main(String[] args) {
        List<String> names = new Vector<>();
        names.add("Eko");
        names.add("Eka");
        names.add("Eki");
        names.add("Budi");
        names.add("Siti");

        for (var n : names){
            System.out.println(n);
        }

        List < Person> persons = new Vector<>();
        persons.addAll(Arrays.asList(
        new Person(1,"Joko","Jakarta"),
        new Person(2,"Sugeng","Yogya"),
        new Person(3,"Andi","Surabaya"),
        new Person(4,"Randi","Surabaya"),
        new Person(5,"Rudi","Surabaya"),
        new Person(6,"Ridho","Bandung"),
        new Person(7,"Aka","Bangladesh")
        ));

        for (var p : persons){
            System.out.println(p);
        }


    }
}
