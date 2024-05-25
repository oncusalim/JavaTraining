package day1;

public class Concatanation {

    public static void main(String[] args) {

        String str1 = "Benim kedimin adı:";
        String str2 = "şanslı";
        String strResult = str1 + " "+ str2 + ".";
        String strResult2 = str1 + (10 + 10);
        String strResult3 = 10.0 + 10 + str1;

        System.out.println(strResult);
        System.out.println(strResult2);
        System.out.println(strResult3);
    }
}
