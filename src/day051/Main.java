package day051;

public class Main {
    public static void main(String[] args) {

        try {
            int x = 8;
            int y = 4;
            int z = 0;
            System.out.println("Sonuç = " + (x / y));
            System.out.println("Sonuç = " + (x / z));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println(); // Output'ta araya boşluk olması için (:

        try {
            String isim = "Dante";  // null yaparsak program kırılmaz hatayı yönettik.
            for (int i = 0; i < isim.length(); i++) {
                System.out.print(isim.charAt(i));
            }
        }catch (NullPointerException ex){
            ex.printStackTrace();
        }

        System.out.println();

        int[] numbers = {53, 17, 3, 13, 29, 10};
        try {
            System.out.println(numbers[10]);
        }catch (ArrayIndexOutOfBoundsException ex){
            ex.printStackTrace();
        }

    }
}
