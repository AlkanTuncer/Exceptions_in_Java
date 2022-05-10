package day048;

public class Main4 {
    public static void main(String[] args) {

        try{
            String isim = null;
            System.out.println(isim.length());
            System.out.println(5/0);
        }catch (Exception ex){
            if (ex instanceof ArithmeticException){
                System.err.println("Aritmetik Hata");
            }else if(ex instanceof NullPointerException){
                System.err.println("Null Pointer Hatası");
            }
        }

    }
}
