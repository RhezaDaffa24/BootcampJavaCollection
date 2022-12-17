package QueueCollection;

import IteratedaCollection.Person;

import java.util.ArrayDeque;
import java.util.Queue;

public class MainQueue {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>(10);
        queue.offer("eko");
        queue.offer("Kurniawan");
        queue.offer("Kennedy");
        System.out.println("head : "+queue.element());
        System.out.println("head : "+queue.peek());

        for (String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());

        // Dengan Class Person
        // Problem Null tidak bisa berhenti
        System.out.println("Make Person : ");
        Queue<Person> tes = new ArrayDeque<>(10);
        tes.offer(new Person(1,"Eko","Surabaya"));
        tes.offer(new Person(2,"Eki","Jakarta"));
        tes.offer(new Person(3,"Eka","Cilacap"));
        tes.offer(new Person(4,"Eke","Ciracas"));
        System.out.println("head : "+tes.element());
        System.out.println("head : "+tes.peek());

        for (String p = String.valueOf(tes.poll()); p != null; p = String.valueOf(tes.poll())){
            System.out.println(p);
        }
        System.out.println(tes.size());
    }
}
