package day049.usagefinally;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {

        String fileName = "src/metin53.txt";

        try {
            FileReader fr = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Hata oluştu. Hata : "+e.getMessage());;
        }


        System.out.println();

        String fileName2 = "src/metin.txt";

        FileReader fr = null;
        try {
            fr = new FileReader(fileName2);
            char[] buf = new char[1024];
            int okunan = fr.read(buf);
            for (int i = 0; i < okunan; i++) {
                System.out.print(buf[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Hata oluştu. Hata : "+e.getMessage());;
        } catch (IOException e) {
            System.out.println("Hata oluştu. Hata : "+e.getMessage());
        } finally {
            try {
                System.out.println("Dosya kapatılıyor.");
                fr.close();
                System.out.println("Dosya kapatılabildi.");
            } catch (IOException e) {
                System.out.println("Dosya kapanırken hata oluştu. Hata : "+e.getMessage());
            }
        }

    }
}
