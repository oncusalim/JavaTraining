package tasks.day1;

public class Task9 {

    public static void main(String[] args) {

        double priceOfProduct = 123.456;
        int priceOfProductInt = (int) priceOfProduct;

        // Veli'nin tüm birikimlerinin toplamı "50000" olsun:
        int savingOfVeli = 126;
        byte savingOfVeliByte = (byte) savingOfVeli;

        System.out.println(priceOfProduct);
        System.out.println(savingOfVeliByte);
    }
}

/*
= Açıklama =
Ali ve Veli, marketten alışveriş yaparken aldıkları ürünlerin fiyatlarını hesaplamak istiyorlar.
Ali bir ürünün fiyatını 123.456 TL olarak görüyor.
Ancak Ali, ondalık kısmı görmek istemiyor ve bu fiyatı tam sayı olarak dönüştürmek istiyor.
Veli ise kendi birikimlerini tam sayı olarak hesapladıktan sonra "byte" cinsine dönüştürmek istiyor.
Son olarak Ali ve Veli aldıkları ürünlerin toplam fiyatını hesaplamak istiyorlar.

Ali ve Veli'nin bu dönüşümleri yaparak toplam fiyatı hesaplayan bir Java programı yazınız.
*/