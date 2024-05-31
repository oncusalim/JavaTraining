package tasks.day2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();

        System.out.print("Aranacak karakter:");
        String karakter = scanner.nextLine();
        int index = metin.indexOf(karakter);
        if (index > -1){
            System.out.println("index : " + index);
        }else {
            System.out.println("Aranan karakterde metinde bulunamadı....");
        }

        scanner.close();
    }
}


/*
= Açıklama =
Kullanıcıdan bir metin ve bir karakter girmesini isteyen ve metindeki karakterin pozisyonunu bulan bir program yazınız.

= Örnek Girdi =
Bir metin giriniz: Merhaba Dünya
Aranacak karakter: a

= Örnek Çıktı =
Karakter 'a' 4. pozisyonda bulunuyor.
*/
