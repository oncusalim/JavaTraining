package day3;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {
    int sonuc = 0;
    int sayi = 0;
        while (sayi < 5) {
        sayi++;
        if (sayi == 3 ) continue;
        sonuc = sonuc + sayi;
            System.out.println("sayı :" + sayi);
            System.out.println("sonuc :" +sonuc);
    }

}
}
