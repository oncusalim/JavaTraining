package tasks.day3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String word = scanner.nextLine();
        scanner.close();

        String repeatingCharacters = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            for (int j = i + 1; j < word.length(); j++) {
                if (c == word.charAt(j) && repeatingCharacters.indexOf(c) == -1) {
                    repeatingCharacters += c;
                    break;
                }
            }
        }

        System.out.println("Tekrar eden karakterler: " + repeatingCharacters);
    }
}

