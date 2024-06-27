package day6.CarClassPractice;

public class CarObject {

    public static void main(String[] args) {
        Mercedes obj1 = new Mercedes("Mercedes", 2020, 4, "red");
        System.out.println(obj1.brand);
        obj1.start();
        obj1.brake();

    }
}
