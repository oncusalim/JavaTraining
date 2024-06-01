package tasks.day2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir ay numarası giriniz (1-12): ");
        int ayNumarasi = scanner.nextInt();

            switch (ayNumarasi) {
                case 6:
                case 7:
                case 8:
                    System.out.println("Yaz mevsimindesiniz.");
                    break;
                case 1: case 2: case 3: case 4: case 5: case 9: case 10: case 11: case 12:
                    System.out.println("Yaz mevsiminde değilsiniz!");
                    break;
                default:
                    System.out.println("Lütfen belirtilen aralıkta bir değer giriniz!...");
            }

        scanner.close();
    }
}


/*
= Açıklama =
Kullanıcıdan bir ay numarası girmesini isteyen ve bu ayın yaz mevsiminde olup olmadığını belirleyen programı "Switch-Case" kullanarak yazınız.

= Örnek Girdi =
Bir ay numarası giriniz (1-12): 7

= Örnek Çıktı =
Yaz mevsimindesiniz.
*/
