package day6.CarClassPractice;

public class Mercedes extends Car{

    public String color;

    public Mercedes(String brand, int model, int volume, String color) {
        super(brand, model, volume);
        this.color = color;
    }

    public boolean isLuxury(){
        return true;
    }

    public void brake(){
        System.out.println("Maksimum fren sistemi kullanıldı");
    }
}
