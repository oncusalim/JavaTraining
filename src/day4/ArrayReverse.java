package day4;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] numbers = {12, 4, 54, 2, 56, 21, 22};
        int[] reversedList = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reversedList[reversedList.length-1-i] = numbers[i];
        }
        //System.out.println(Arrays.toString(reversedList));
        for (int each : reversedList) {
            System.out.println(each);
        }

    }
}
