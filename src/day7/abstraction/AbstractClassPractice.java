package day7.abstraction;

 abstract class AbstractClass {
    public abstract void animalSound();
    public void sleep() {
        System.out.println("Zzz");
    }

}

class ChildClass extends AbstractClass {
     public void animalSound() {
        System.out.println("Hayvan ses çıkarır...");
    }
}
public class AbstractClassPractice {
    public static void main(String[] args) {
        AbstractClass obj = new ChildClass();
    }
}