package day6.inheritance;

class Hayvan {
    public boolean isLive = true;
    public String tur = "Hayvan";


    public void sesCikar() {
        System.out.println("Hayvan ses çıkarır");
    }
    public void feeding(){
        System.out.println("Hayvan yemek yiyor");
    }
}

class Kedi extends Hayvan {
    public String tur = "Kedi";
    public void sesCikar() {
        System.out.println("Miyav");
    }
}
public class Ornek17 {
    public static void main(String[] args) {
     //   Hayvan hayvan = new Hayvan();
       // System.out.println(hayvan.tur);
       // hayvan.sesCikar();

        Kedi kedi = new Kedi();
        System.out.println(kedi.isLive);
        System.out.println(kedi.tur);
        kedi.sesCikar();
        kedi.feeding();


    }
}

