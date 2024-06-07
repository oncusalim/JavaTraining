package day4;

public class MethodWithReturn {
    public static void main(String[] args) {
        int greatNumber = max(12, 50);
        System.out.println(greatNumber);
        System.out.println(max(10,100));
        System.out.println(max(2,-50));
    }

    public static int max(int number1, int number2) {
        if (number1> number2) {
            return number1;
        }
        return number2;
    }
}
