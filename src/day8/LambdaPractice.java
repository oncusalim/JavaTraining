package day8;

import java.util.ArrayList;
import java.util.List;

public class LambdaPractice {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        numbers.forEach(p->{
            if (p==8) {
                System.out.println("içersinde 8 var");
            }
        });
    }
}
