package day4;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;

        System.out.print(start + " ile " + end + " arasındaki Armstrong sayıları: ");

        for (int i = start; i <= end; i++) {
            int number = i;
            int original = number;
            int sum = 0;
            int n = String.valueOf(number).length();

            while (number != 0) {
                int digit = number % 10;
                sum += Math.pow(digit, n);
                number /= 10;
            }

            if (sum == original) {
                System.out.print(i + " ");
            }
        }
    }
}

