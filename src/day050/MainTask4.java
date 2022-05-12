package day050;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainTask4 {
    public static void main(String[] args) {

        // Bir metnin içeriğini okuyan Java programı.

        try( FileInputStream fis = new FileInputStream("src/exceptions-keywords.txt")){
            byte[] data = fis.readAllBytes();
            for(byte b : data){
                System.out.print((char)b);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());;
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
