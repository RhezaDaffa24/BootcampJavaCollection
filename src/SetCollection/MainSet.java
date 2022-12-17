package SetCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("eko");
        names.add("Siti");
        names.add("Kennedy");

        for (var name : names){
            System.out.println(name);
        }
        Set<String> hobbies = new LinkedHashSet<>();
        hobbies.add("Gaming");
        hobbies.add("Coding");
        hobbies.add("Cycling");
        hobbies.add("E-Sport");

        System.out.println(hobbies);
        System.out.println("Size : "+ hobbies.size());
    }
}
