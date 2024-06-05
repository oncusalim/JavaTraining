package day4;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();
        scanner.close();

        int a = 0, b = 1;
        int i = 1;

        while (i <= number) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        }
    }
}

