package day2;

public class NestedIfStatement {
    public static void main(String[] args) {
        int age = 22;
        boolean isMan = true;
        boolean isDisabled = false;

        if (age >= 20) {
            if (isMan) {
                System.out.println("Erkek");
                if (!isDisabled) {
                    System.out.println("yükümlülüğü var");
                }else {
                    System.out.println("disabled");
                }
            }else {
                System.out.println("Kadın");
            }
        }
        else
            System.out.println("yaşı uygun değil");
    }
}
