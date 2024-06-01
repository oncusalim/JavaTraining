package day3;
public class DoWhilePractice2 {
    public static void main(String[] args) {
        String str = "deneme";
        int index = -1;
        do {
            index++;
            char karakter = str.charAt(index);
            if (karakter =='a' || karakter == 'e' || karakter == 'i') continue;
            System.out.println(karakter);

        }while(index < str.length()-1);
    }
}
