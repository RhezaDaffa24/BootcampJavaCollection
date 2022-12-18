package CollectionClass;

import Model.AbstractClass;

import java.util.Queue;

public class MainAbstractQueue  {
    public static void main(String[] args) {
        Queue<String> queue = new AbstractClass<>();
        queue.offer("eko");
        queue.offer("budi");
        queue.offer("siti");

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.size());

    }
}
