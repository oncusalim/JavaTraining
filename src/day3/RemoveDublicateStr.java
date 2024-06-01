package day3;

public class RemoveDublicateStr {

    public static void main(String[] args) {
        String str = "aaabbbccaaaa";  //abc
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch)==-1){
                result = result + ch; //ab
            }
        }
        System.out.println(result);


    }
}
