package day047;

public class Main1 {
    public static void main(String[] args) {

        // unchecked Exception

        int[] sayilar = {1,3,5,2};

        try {
            System.out.println(sayilar[5]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.err.println(ex.getMessage());
        }

        System.out.println("Program normal sonlandı.");


        String[] isimler = {"Ronaldo","Pele","Cafu","Socrates","Carlos"};

        try {
            for (int i = 0; i <= isimler.length ; i++) {
                System.out.println(isimler[i]);
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }

    }
}
