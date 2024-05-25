package day1;

public class Casting {

    public static void main(String[] args) {

        // double > float > long > int > short > byte
        int a = 100;
        short b = (short) a;
        long c = a;
        double d = 2000.93;

        int e = (int) d;
        System.out.println(e);
    }
}
