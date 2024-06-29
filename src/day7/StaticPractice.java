package day7;

 class Static1 {
    public static final String schoolName = "Osmangazi Lisesi";
    public static int countOfStudent = 100;

    static {
        System.out.println("static block");
    }
    public Static1(){
        System.out.println("constructor");
    }
    public static void printPrac(){
        System.out.println("Deneme");
    }

     public void printPrac2(){
         System.out.println("Deneme2");
     }

}

public class StaticPractice {
    public static void main(String[] args) {
        //Static1 obj = new Static1();
        Static1.printPrac();
        //Static1.schoolName = "yani okul";
        System.out.println(Static1.schoolName);

    }
}
