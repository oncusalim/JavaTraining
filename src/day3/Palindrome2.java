package day3;

public class Palindrome2 {

    public static void main(String[] args) {
        String str = "kaaayaaak";
        boolean isPalindrome = true;
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
