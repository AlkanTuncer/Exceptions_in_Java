package day051;

public class MainRapperClass {
    public static void main(String[] args) {

        // int --> Integer

        Integer sayi = 5;
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        System.out.println(Integer.MIN_VALUE);

        try {
            long sayi2 = Long.parseLong("12345678900000");
            long sayi3 = Long.parseLong("123456789A0000");
            System.out.println(sayi2);
            System.out.println(sayi3);
        }catch (NumberFormatException e){
            System.err.println(e.getMessage());
        }

    }
}
