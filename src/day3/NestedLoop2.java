package day3;

public class NestedLoop2 {
    public static void main(String[] args) {
        int sayac = 0;
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=6 ; j++) {
                sayac++;
                System.out.println( sayac + " : 1. zar :" + i + "| 2. zar : " + j);

            }
        }
    }
}
