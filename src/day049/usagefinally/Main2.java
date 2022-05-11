package day049.usagefinally;

import java.io.File;

public class Main2 {
    public static void main(String[] args) {

        File f = new File("src/metin.txt");   // --> src\\metin.txt

        if (f.exists()){
            System.out.println("Dosya mevcut.");
            System.out.println("Dosya adı : "+f.getName());
            System.out.println("Parent : "+f.getParent());
            System.out.println("Path : "+f.getAbsolutePath());
        }else {
            System.out.println("Böyle bir dosya yok.");
        }

    }
}
