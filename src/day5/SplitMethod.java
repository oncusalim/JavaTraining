package day5;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String str = "Ayşe,tatile,çıktı";
        char[] ch = str.toCharArray();
        String[] dizi = str.split("");
        System.out.println(Arrays.toString(dizi));
        System.out.println(Arrays.toString(ch));

    }
}
