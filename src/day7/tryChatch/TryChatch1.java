package day7.tryChatch;

public class TryChatch1 {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            int a = 10/0;
            System.out.println("try");
        }catch (Exception exception){
            System.out.println("Hata ele alındı");
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("final");
        }

        System.out.println("Deneme");
    }
}
