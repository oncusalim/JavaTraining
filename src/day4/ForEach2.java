package day4;

import java.util.Arrays;

public class ForEach2 {

    public static void main(String[] args) {
        int[] numbers = {12, 4, 54, -2, -56};
        int max = Integer.MIN_VALUE;
        System.out.println(max);

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
}
