package day6.encapsulation;
public class Person1Objects {

    public static void main(String[] args) {

        Person1 person1 = new Person1("Ahmet","mutlu", 18,'E');
        Person1 person2 = new Person1("Arzu","mut", 20,'K');
        Person1 person3 = new Person1("Leyla","Ak", 21,'K');
        Person1 person4 = new Person1("Saffet","al", 17,'E');

        person1.setFirstName("Mehmet");
        System.out.println(person1.getFirstName());


    }
}
