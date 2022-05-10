package day048.task;

public class MainTools {
    public static void main(String[] args) {

        char[] dizi = {'A','L','K','A','N'};
        System.out.println(Tools.convertToString(dizi));


        int[] sayilar = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Tools.convertToString(sayilar));

        int[] sayilar2 = null;
        System.out.println(Tools.convertToString(sayilar2));


        String value = "Alkan";

        System.out.println(Tools.reverse(value));

    }
}
