package MappingCollection;

import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;

public class MainWeakHashMap {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new WeakHashMap<>();
//        Random number = new Random(9);
        for (int i = 0; i < 10; i++) {
            map.put(i, i);//number.nextInt());
        }
        System.out.println("Map Size Pertama : "+map.size());

        System.gc();

        System.out.println("Setelah Dilakukan GarbageCollection : "+map.size());
    }
}
