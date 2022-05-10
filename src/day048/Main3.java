package day048;

import javax.swing.*;

public class Main3 {
    public static void main(String[] args) {

        String isim = JOptionPane.showInputDialog("Adınız nedir?");

        try {
            System.out.println(isim);
            System.out.println(isim.length());
        }catch (NullPointerException ex){
            System.err.println("Hata : "+ex.getMessage());
        }


        String isim2 = JOptionPane.showInputDialog("Adınız nedir?");

        if (isim2 != null && isim.length() > 0){  // && shortcut ile ilk kısım true ise ikinciye bakmaz. False ise ikinciye bakar.
            System.out.println(isim2);
        }

    }
}
