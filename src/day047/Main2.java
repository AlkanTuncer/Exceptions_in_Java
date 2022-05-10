package day047;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {

        try{    // Eğer dosyanın full path'i yazılmamış ise programın calıstıgı klasör fullpath kabul edilir.

            FileReader dosya = new FileReader("deneme.txt");
            char[] dizi = new char[1024];
            int okunan = dosya.read(dizi);
            for (int i = 0; i <= okunan; i++) {
                System.out.print(dizi[i]);
            }
            System.out.println();
        }
        catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }

        System.out.println("Program normal sonlandı.");

    }
}
