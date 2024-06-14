package day5;

public class WrapperClass1 {
    public static void main(String[] args) {
        int number1 = 123;
        Integer number3 = 432;
        Integer number2 = number3;

        number2 = 512;
        System.out.println(number1);
        System.out.println(number2);
        //int number3 = number2;

        byte b1 = 23;
        Byte b2 = b1;
        char char2 = 'l';
        Character char1 = char2;

        int[] numbers1 = {1,6,2,8,3};
        Integer[] numbers2 = {2,4};

    }
}
