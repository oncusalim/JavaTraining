package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, Object> map1 = new HashMap<>();
        map1.put("adi", "ahmet");
        map1.put("yasi", 12);
        map1.put("cinsiyet", 'E');

        Map<String, Object> map2 = new HashMap<>();
        map2.put("adi", "mehmet");
        map2.put("yasi", 18);
        map2.put("cinsiyet", 'E');

        Map<String, Object> map3 = new HashMap<>();
        map3.put("adi", "mehmet");
        map3.put("yasi", 18);
        map3.put("cinsiyet", 'E');

        List<Map<String, Object>> liste = new ArrayList<>();
        liste.add(map1);
        liste.add(map2);
        liste.add(map3);

        for (Map each : liste){
            System.out.println(each);
        }


    }
}
