package tasks.day3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0;

        for (int temp = number; temp != 0; temp /= 10) {
            sum += temp % 10;
        }

        System.out.println("Basamakların toplamı: " + sum);
    }
}
