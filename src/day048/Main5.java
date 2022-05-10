package day048;

import javax.swing.*;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        Integer number1 = 5;
        Double d = 5.3;
        Long id = 57L;


        try {
            int sayi = Integer.parseInt(JOptionPane.showInputDialog("Bir sayı giriniz :"));
            int result = 500 / sayi;
            int[] sayilar = new int[5];
            System.out.println(sayilar[result]);
            System.out.println("Result = " + result);
        }catch (NumberFormatException ex){
            System.err.println(ex.getMessage());
        }catch (ArithmeticException ex){
            System.err.println(ex.getMessage());
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println(ex.getMessage());
        }catch (Exception ex){
            System.err.println("Yeter da "+ex.getMessage());
        }

    }
}
