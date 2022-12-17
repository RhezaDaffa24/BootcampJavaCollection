package MappingCollection;

import Model.LevelEnum;

import java.util.EnumMap;

public class MainEnumMap {
    public static void main(String[] args) {
        EnumMap<LevelEnum, String> map = new EnumMap<>(LevelEnum.class);
        map.put(LevelEnum.FREE,"Gratis");
        map.put(LevelEnum.PREMIUM,"Berbayar");

        System.out.println(map.get(LevelEnum.FREE));
        System.out.println(map.get(LevelEnum.PREMIUM));
    }
}
