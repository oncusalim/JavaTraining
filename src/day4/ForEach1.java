package day4;

public class ForEach1 {
    public static void main(String[] args) {

        String[] days = {"Pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar","Pazartesi", "salı", "çarşamba", "perşembe", "cuma", "cumartesi", "pazar"};

        for (String each : days) {
           // if (each.equalsIgnoreCase("cuma")) continue;
                System.out.println(each);

        }
    }
}
