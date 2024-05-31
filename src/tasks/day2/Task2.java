package tasks.day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime giriniz...");
        String kelime = scanner.nextLine();

        System.out.println("Kelimenin uzunluğu: " + kelime.length());


        scanner.close();
    }
}


/*
= Açıklama =
Kullanıcıdan bir kelime girmesini isteyen ve kelimenin uzunluğunu ekrana yazdıran programı yazınız.

= Örnek Girdi =
Bir kelime giriniz: merhaba

= Örnek Çıktı =
Kelimenin uzunluğu: 7
*/
