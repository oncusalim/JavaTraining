package day2;

import java.util.Scanner;

public class SwitchMultiCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir gezegen adı giriniz: ");
        String gezegenAdi = scanner.next();

        switch (gezegenAdi) {
            case "Merkür":
            case "Venüs":
            case "Dünya":
            case "Mars":
                System.out.println("İç gezegen");
                break;
            case "Jüpiter":
            case "Satürn":
            case "Uranüs":
            case "Neptün":
                System.out.println("Dış gezegen");
                break;
            default:
                System.out.println("Yanlış bir gezegen adı girdiniz!");
        }

        scanner.close();
    }
}
