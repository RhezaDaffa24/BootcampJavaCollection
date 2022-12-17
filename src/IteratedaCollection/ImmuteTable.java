package IteratedaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmuteTable {
    public static void main(String[] args) {
        Person person = new Person("Ardian",
                Arrays.asList("Coding","Desain","Testing"));

        System.out.println(person);
        //cara salah
//        person.getHobbies().add("Gaming");
//        System.out.println(person);

        //cara benar
        List<String> hobbies = new ArrayList<>(person.getHobbies());
        hobbies.add("Gaming");
        person.setHobbies(hobbies);
        System.out.println(person);
    }

}
