package MappingCollection;

import java.util.Map;

public class MainImmuttableMap {
    public static void main(String[] args) {
        Map<String , String> name = Map.of(
                "firstPerson" , "Eko",
                "secondPerson","Budiman",
                "thirdPerson","Siti"
        );
        // error karena immutable
//        name.put("fourthPerson","eaaaaa");
        System.out.println(name.get("firstPerson"));
    }
}
