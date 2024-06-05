package day4;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String word = scanner.nextLine();
        scanner.close();

        boolean isPalindrome = true;
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(word + " palindromik bir kelimedir.");
        } else {
            System.out.println(word + " palindromik bir kelime değildir.");
        }
    }
}

