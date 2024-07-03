package day8;

enum Level {
    LOW,
    MEDIUM,
    HIGH
}
enum UserType {
    GOLD,
    PREMIUM,
    GUEST
}

public class EnumPractice {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        checkStatus(UserType.PREMIUM);

        checkStatus2("GOLd");
    }

    public static void checkStatus(UserType user){
        if (user == UserType.GOLD){
            System.out.println("gold üye");
        }else if (user == UserType.PREMIUM){
            System.out.println("premium üye");
        }else {
            System.out.println("Guest");
        }
    }

    public static void checkStatus2(String str){
        if (str.equals("GOLD")){
            System.out.println("gold üye");
        }else if (str.equals("PREMIUM")){
            System.out.println("premium üye");
        }else {
            System.out.println("Guest");
        }
    }
}
