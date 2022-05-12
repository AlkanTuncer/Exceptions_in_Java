package day050;

import java.io.File;
import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) {

        // Kayıtlı bir dosyanın var olup olmadığını kontrol edip silen Java programını yazınız.

        Scanner input = new Scanner(System.in);

        File dosya = new File("src/task3.txt");

        if(dosya.exists()) {
            System.out.println("Dosya mevcut.");
            System.out.println("Dosyayı silmek ister misiniz?");
            String cevap = input.nextLine();
            if (cevap.equalsIgnoreCase("evet")) {
                dosya.delete();
                System.out.println("Dosya silindi.");
            }
        }else {
            System.out.println("Dosya mevcut değil.");
        }

        
    }
}
