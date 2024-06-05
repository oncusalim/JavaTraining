package day4;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Hesaplanacak sayı
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(number + " sayısının faktöriyeli: " + factorial);
    }
}
