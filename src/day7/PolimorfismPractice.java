package day7;

import java.util.ArrayList;
public class PolimorfismPractice {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Pig pig = new Pig();
        Dog dog = new Dog();
        Dog dog2 = new Dog();


        ArrayList<Animal> list = new ArrayList<>();
        list.add(animal);
        list.add(pig);
        list.add(dog);
        list.add(dog2);

        System.out.println(countOfDogs(list));

    }

    public static int countOfDogs(ArrayList<Animal> list){
        int count =0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getClass().toString().contains("Dog")){
                count++;
            }
        }
        return count;
    }
}
