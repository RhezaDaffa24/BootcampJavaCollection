package IteratedaCollection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIterate {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Ahmad Roni","Ahmad Subarjo","Ahmad Yani","Ahmad samsudin","Ahmad yoi");
        /*
        for (var name: names){
            System.out.print(name+"\t");
        }*/
        // iterator
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println("\n");
        Iterable<Person> persons = Arrays.asList(
                new Person(1,"Rheza","Yogyakarta"),
                new Person(2,"markus","magelang"),
                new Person(3,"sirus","cialacap")
        );
        /*
        for (var peson: persons){
            System.out.println(peson);
        }*/
        Iterator<Person> personIterator = persons.iterator();
            while (personIterator.hasNext()){
                System.out.println(personIterator.next());
            }
        }
    }

