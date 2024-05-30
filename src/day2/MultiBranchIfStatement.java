package day2;

public class MultiBranchIfStatement {

    public static void main(String[] args) {
        int a = 15;
        int b = 15;
        int c = 15;

        if (a == b && a == c ) {
            System.out.println("Eşkenar üçgen");
        } else if (a == b || b == c || a == c ) {
            System.out.println("İkiz kenar üçgen");
        } else {
            System.out.println("Çeşit kenar üçgen");
        }
    }
}
