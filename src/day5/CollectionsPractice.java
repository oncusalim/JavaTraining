package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4,1,7,9,2,4,3,9));

        for (int i = 0; i < 2; i++) {
            numbers.removeIf(p->p==Collections.max(numbers));
        }
        System.out.println(numbers);
    }
}
