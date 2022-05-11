package day048.task;

public class MainTools {
    public static void main(String[] args) {

        char[] dizi = {'A','L','K','A','N'};
        String mesaj = Tools.convertToString(dizi);
        System.out.println(mesaj);


        int[] sayilar = {0,1,2,3,4,5,6,7,8,9};
        mesaj = Tools.convertToString(sayilar);
        System.out.println(mesaj);
        System.out.println(Tools.convertToString(sayilar));


        String value = "Alkan";
        String rvalue = Tools.reverse(value);

        System.out.println(rvalue);

    }
}
