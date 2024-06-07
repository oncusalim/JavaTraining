package day4;

public class ReturnBooleanMethod {

    public static boolean checkAge(int age){
        if (age>=18) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkAge(17));
    }
}
