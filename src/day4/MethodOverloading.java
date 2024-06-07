package day4;

public class MethodOverloading {
    public static int topla(int num1, int num2){
        return num1 + num2;
    }

    public static double topla(double num1, double num2){
        return num1 + num2;
    }

    public static int topla(int num1){
        return num1 + 100;
    }
    public static void main(String[] args) {
        System.out.println(topla(6, 12));
        System.out.println(topla(6.8, 12.3));
        System.out.println(topla(12));
    }
}
