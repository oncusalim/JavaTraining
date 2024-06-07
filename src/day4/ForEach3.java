package day4;

public class ForEach3 {

    public static void main(String[] args) {
        int[] numbers = {12, 4, 54, 2, 56};

        double sum = 0;
        for (int number : numbers) {
            sum += number;  //sum = sum + number;
        }
        System.out.println(sum);
        System.out.println("Avarage :" + sum/numbers.length );
    }
}
