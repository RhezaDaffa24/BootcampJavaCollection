package SortingCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainBinarySearch {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            numbers.add(i);
        }

        int index = Collections.binarySearch(numbers, 500);
        System.out.println(index);
    }
}
