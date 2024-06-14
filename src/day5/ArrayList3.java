package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW", "BYD", "Opel", "BYD"));
        System.out.println(cars);
/*
        ArrayList<String> cars2 = new ArrayList<>();
        cars2.add("Renault");
        cars2.add("BMW");
*/
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        boolean isContains = cars.containsAll(Arrays.asList("BYD", "BMW"));
        boolean isContain = cars.contains("Opel");
        System.out.println(isContains);
        System.out.println(isContain);
        System.out.println(cars);
        System.out.println(cars.indexOf("BYD"));
        System.out.println(cars.lastIndexOf("BYD"));
    }
}
