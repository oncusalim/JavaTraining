package day4;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Bir sayı girin (0 ile bitirin): ");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        scanner.close();
        System.out.println("Toplam: " + sum);
    }
}
