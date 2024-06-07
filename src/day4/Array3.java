package day4;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        char[] alphabets = new char[26];


        for (char i = 'A', index=0; i <= 'Z'; i++, index++) {
            alphabets[index] = i;
        }
        System.out.println(Arrays.toString(alphabets));
    }
}
