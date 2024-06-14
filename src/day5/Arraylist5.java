package day5;

import java.util.*;


public class Arraylist5 {
    public static void main(String[] args) {
        String[] dizi = {"ahmet", "mehmet", "deniz"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(dizi));
        list.add("ayse");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,1,7,9,2,4,3));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);
    }
}
