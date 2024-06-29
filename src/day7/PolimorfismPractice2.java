package day7;

import java.util.ArrayList;

public class PolimorfismPractice2{
    public static void main(String[] args) {
        String str = "Deneme";
        Integer number = 125;
        Long number2 = 35464444l;
        ArrayList<Object> list = new ArrayList<>();
        list.add(str);
        list.add(number);
        list.add(number2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(isString(list.get(i)));
        }
    }

    public static boolean isString(Object obj){
        if (obj.getClass().toString().contains("String")){
            return true;
        }
     return false;
    }
}
