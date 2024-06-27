package day6;

 public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public char gender;

    public Person(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public Person(){

    }
    public boolean isEligable(){
        if (age>=18) {
            return true;
        }
        return false;
    }

    public void eating(){
        System.out.println("Person is eating");
    }

     public String toString() {
         return "Person{" +
                 "firstName='" + firstName + '\'' +
                 ", lastName='" + lastName + '\'' +
                 ", age=" + age +
                 ", gender=" + gender +
                 '}';
     }
}
