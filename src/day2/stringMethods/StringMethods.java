package day2.stringMethods;

public class StringMethods {

    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("length :" + str.length());
        System.out.println("toUpperCase :" + str.toUpperCase());
        System.out.println("toLowerCase :" + str.toLowerCase());
        System.out.println("indexOf :" + str.indexOf('W'));
        System.out.println("indexOf :" + str.indexOf("Wor"));
        System.out.println("lastIndexOf :" + str.lastIndexOf('o'));
        System.out.println("substring :" + str.substring(3,8));
        System.out.println("equals :" + str.equals("Hello World!"));
        System.out.println("equalsIgnoreCase :" + str.equalsIgnoreCase("heLLO world!"));
        System.out.println("replace :" + str.replace("orl","11111"));
        System.out.println("trim :" + "  deneme  ".trim());
        System.out.println("charAt :" + str.charAt(4));
        System.out.println("isBlank :" + " ".isBlank());
        System.out.println("isEmpty :" + "".isEmpty());
        System.out.println("endsWith :" + str.endsWith("ld!"));
        System.out.println("startWith :" + str.startsWith("He"));
        System.out.println("contains :" + str.contains("llo"));

    }
}
