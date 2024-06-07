package day4;

public class Array2 {

    public static void main(String[] args) {
        int[] list1 = {12, 15,2,7,10,15};
        int[] list2 = new int[5];
        int[] results = new int[20];
        list2[0] = 25;
        list2[1] = 20;
        list2[3] = 30;
        list2[4] = 35;
        for (int i = 0; i < list2.length; i++) {
            results[i] = list1[i] + list2[i];
        }

        for (int i = 0; i < results.length; i++) {
            System.out.println(results[i]);
        }

    }
}
