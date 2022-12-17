package MappingCollection;

import java.util.IdentityHashMap;
import java.util.Map;

public class MainIdentityHashMap {
    public static void main(String[] args) {
        String key1 = "name.first";

        String name = "name";
        String first = "first";

        String key2 = name +" ."+ first;

        Map<String, String > map = new IdentityHashMap<>();
//        map.put(key1,"Rheza Daffa Pamungkas");
        map.put(key2, "Junianto Sitorus");
//        map.put(key2, "Rheza Daffa Pamungkas");
        map.put(key1,"Junianto Sitorus");

        System.out.println(map);
        System.out.println(map.size());
    }
}
