package day050;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Kaydedilicek metni giriniz;");
        String metin = input.nextLine();

        try ( FileWriter fw = new FileWriter ("src/metin0053.txt",true) ) {
            fw.write(metin);
            System.out.println("Kaydedildi.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
