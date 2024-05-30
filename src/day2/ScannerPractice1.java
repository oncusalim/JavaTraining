package day2;


import java.util.Scanner;

public class ScannerPractice1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin....");
        int sayi1 = scanner.nextInt();

        System.out.println("İkinci sayıyı girin....");
        int sayi2 = scanner.nextInt();

        System.out.println("Yapmak istediğiniz işlemi girin : * / - +");
        scanner.nextLine();

        String islem = scanner.nextLine();

        switch(islem) {
            case "*":
                System.out.println(sayi1*sayi2);
                break;
            case "/":
                System.out.println((float)sayi1 / sayi2);
                break;
            case "+":
                System.out.println(sayi1 + sayi2);
                break;
            case "-" :
                System.out.println(sayi1-sayi2);
                break;
            default:
                System.out.println("hatalı değer girdiniz");
        }
        scanner.close();


    }
}
