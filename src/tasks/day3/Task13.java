package tasks.day3;

public class Task13 {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            int number = i;
            int original = number;
            int reversed = 0;

            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }

            if (original == reversed) {
                sum += i;
            }
        }

        System.out.println(start + " ile " + end + " arasındaki palindromik sayıların toplamı: " + sum);
    }
}
