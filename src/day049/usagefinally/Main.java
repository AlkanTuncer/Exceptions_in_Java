package day049.usagefinally;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("Kod denenir.");
            int x = 7/0;
        }catch (Exception ex){
            System.out.println("Hatalı durum oluştu ve yönetildi.");
        }finally {
            System.out.println("Buradaki kod hata oluşsa da oluşmasa da çalışır.");
        }
        System.out.println("try bloğu dışı.");

    }
}
