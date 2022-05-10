package day048;

public class Main {
    public static void main(String[] args) {

        int x = 5;
        int y = 0;

        try {
            int z = x / y;
            System.out.println("Sonuç = "+z);
        }catch (ArithmeticException ex){
            System.err.println("Bir hata oluştu."+ex.getMessage());
        }


        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());

    }
}
