package day7;


class Animal {

    public void animalMethod(){
        System.out.println("animal method");
    }
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
    public void dogMethod(){
        System.out.println("dog method");
    }
}

class Polimorfism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create a Animal object
        Animal myPig = new Pig();  // Create a Pig object
        Animal myDog = new Dog();  // Create a Dog object
        Dog dog2 = new Dog();
        ((Dog)myDog).dogMethod();


    }
}
