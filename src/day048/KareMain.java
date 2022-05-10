package day048;

public class KareMain {
    public static void main(String[] args) {

        Kare kare = new Kare();
        try {
            kare.setKenar(-5);
            System.out.println("Alan = "+ kare.alanHesapla());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
