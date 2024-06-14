package day5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(3,8,90,2, 8));
        System.out.println(numbers);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        numbers.removeAll(list);
        //numbers.removeIf(p-> p == 8);

        System.out.println(numbers);
    }
}
