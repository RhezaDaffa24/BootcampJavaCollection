package SetCollection;

import Model.GenderEnum;

import java.util.EnumSet;
import java.util.Set;


public class EnumSetClass {
    public static void main(String[] args) {
        Set<GenderEnum> genders = EnumSet.allOf(GenderEnum.class);
        System.out.println(genders);

        Set<String> immutSet = Set.of("Andika","Sudirman","Suparman");
        immutSet.remove("Andika");
        immutSet.add("Roni");

    }
}
