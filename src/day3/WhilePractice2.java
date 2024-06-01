package day3;

import java.util.Scanner;

public class WhilePractice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sonuc = 0;

        while (true) {
            System.out.println("sayı giriniz...");
            int sayi = scanner.nextInt();

            if (sayi == 0 ) break;
            sonuc = sonuc + sayi;
        }
        System.out.println(sonuc);
        scanner.close();
    }
}
