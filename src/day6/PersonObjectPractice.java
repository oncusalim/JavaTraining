package day6;

import java.util.ArrayList;

public class PersonObjectPractice {

    public static void main(String[] args) {
        Person person1 = new Person("Ahmet","mutlu", 18,'E');
        Person person2 = new Person("Arzu","mut", 20,'K');
        Person person3 = new Person("Leyla","Ak", 21,'K');
        Person person4 = new Person("Saffet","al", 17,'E');
        ArrayList<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);

        list.removeIf(p->p.age<18);

            for(Person each: list){
            System.out.println(each.firstName + " : " + each.isEligable());
        }

    }
}
