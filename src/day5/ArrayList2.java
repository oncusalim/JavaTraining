package day5;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Renault");
        cars.add("BMW");
        cars.add("Mercedes");
        System.out.println(cars);

        cars.set(1,"Opel");
        System.out.println(cars);
        String removedElement = cars.remove(1);
        System.out.println(cars);
        System.out.println(removedElement);
        String removedElement2 = cars.remove(1);
        System.out.println(removedElement2);
        System.out.println(cars);
    }
}
