package day051;

public class MainTask {
    public static void main(String[] args) {

        String[] futbolcular = {"C.Ronaldo","Messi","Mbappe","De Bruyne","Sadio Mane"};
        String[] dizi = null;

        showContent(futbolcular);
        showContent(dizi);

        System.out.println();

        String str = "5*";
        String str1 = "4x";
        String str2 = "3-";

        printSymbol(str);
        System.out.println();
        printSymbol(str1);
        System.out.println();
        printSymbol(str2);


    }

    // TASK 1
    public static void showContent (String[] values){
        try{
            for (int i = 0; i < values.length; i++) {
                System.out.print(values[i]+",");
            }
            System.out.print("\n");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    // TASK 2
    public static void printSymbol(String value){
        try{
        String sayi = "";
        String sembol = "";
        sayi += value.charAt(0);
        int x = Integer.parseInt(sayi);     // int sayi = Integer.parseInt(""+value.charAT(0));
        sembol += value.charAt(1);          // String sembol = ""+value.charAT(1);
            for (int i = 0; i < x; i++) {
                System.out.print(sembol+" ");
            }
        }catch (NumberFormatException | NullPointerException | ClassCastException e){
            System.out.println(e.getMessage());
        }
    }

}
