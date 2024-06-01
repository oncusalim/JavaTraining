package day3;

public class Palindrome {

    public static void main(String[] args) {
        String str = "Kayak";
        String reverseStr = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        System.out.println(reverseStr);

        if (str.equalsIgnoreCase(reverseStr)) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}

