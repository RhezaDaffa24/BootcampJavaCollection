package SortedSet;

import IteratedaCollection.Person;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class MainSortedSet {
    public static void main(String[] args) {
        SortedSet<Person> persons = new TreeSet<>(new PersonComparator());
        persons.add(new Person(1,"Joko","Jakarta"));
        persons.add(new Person(2,"Sugeng","Yogya"));
        persons.add(new Person(3,"Andi","Surabaya"));
        persons.add(new Person(4,"Randi","Surabaya"));
        persons.add(new Person(5,"Rudi","Surabaya"));
        persons.add(new Person(6,"Ridho","Bandung"));
        persons.add(new Person(7,"Aka","Bangladesh"));

        for (Person p: persons){
            System.out.println(p);
        }
        System.out.println("\n");
        System.out.println("Navigable Set");
        NavigableSet<Person> personsNav = new TreeSet<>(new PersonComparator());
        personsNav.add(new Person(1,"Anik","Jakarta"));
        personsNav.add(new Person(2,"Koko","Yogya"));
        personsNav.add(new Person(3,"Anis","Surabaya"));
        personsNav.add(new Person(4,"Ganjar","Surabaya"));
        personsNav.add(new Person(5,"Edi","Surabaya"));
        personsNav.add(new Person(6,"Polo","Bandung"));
        personsNav.add(new Person(6,"Bibi","Bangladesh"));

        for (Person pp : personsNav){
            System.out.println(pp);
        }

        System.out.println("\nSetelah diubah");

        for (Person p : personsNav){

            System.out.println(p);
        }
    }

}
