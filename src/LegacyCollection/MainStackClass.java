package LegacyCollection;

import java.util.Arrays;
import java.util.Stack;

public class MainStackClass {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.push("Eka");
        names.push("Eki");
        names.push("Eko");
        names.push("Eku");
        names.push("Budi");
        names.push("Sapto");

        for(var name = names.pop(); name != null ; name = names.pop()){
            System.out.println(name);
        }

    }
}
