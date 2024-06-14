package day5;

public class WrapperClass2 {
    public static void main(String[] args) {
        String str = "123.8";

        double num = Double.parseDouble(str);
        Integer num3 = Integer.valueOf("45677");
        Double num2 = Double.valueOf(str);
        System.out.println(num + 1);
        System.out.println(num3);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        Integer num5 = 1234;

        System.out.println(num5.toString() + 456);

        char ch = '0';
        System.out.println(Character.isLetterOrDigit(ch));

        String str2= "dfdlkfdl4546";
        char[] chars = str2.toCharArray();

        for (char each : chars){
            System.out.println(each);
        }


    }
}
