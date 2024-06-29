package day7.tryChatch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class tryCatch2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("start");
        Thread.sleep(5000);
        System.out.println("stop");
        //fileReadingMethod();
        //throw new Exception("deneme");
        fileReadingMethod();
    }

    public static void fileReadingMethod()  {

        try {
            FileReader file = new FileReader("deneme.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("finish");
    }
}
