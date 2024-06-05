package day4;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String word = scanner.nextLine();
        scanner.close();

        String uniqueCharacters = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < word.length(); j++) {
                if (i != j && c == word.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCharacters += c + " ";
            }
        }

        System.out.print("Benzersiz karakterler: " + uniqueCharacters);
    }
}

