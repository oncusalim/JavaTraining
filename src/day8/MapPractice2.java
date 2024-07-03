package day8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("adi", "ahmet");
        map.put("yasi", 12);
        map.put("cinsiyet", 'E');

        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        for (Object value : map.values()) {
            System.out.println(value);
        }

        map.clear();
        System.out.println(map);
    }
}
