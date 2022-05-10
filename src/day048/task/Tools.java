package day048.task;

public class Tools {

    public static String convertToString(char[] values){
        String metin = "";
        try{
            for (int i = 0; i < values.length; i++) {
                metin += values[i];
            }
        }catch (NullPointerException ex){
            System.err.println(ex.getMessage());
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
    return metin;
    }


    public static String convertToString(int[] values){
        String str53 = "";
        try{
            for (int i = 0; i < values.length; i++) {
                str53 += values[i];
            }
        }catch (NullPointerException ex){
            System.err.println(ex.getMessage());
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        return str53;
    }


    public static String reverse(String value){
        String str = "";
        try{
            for (int i = value.length()-1; i >=0 ; i--) {
                str += value.charAt(i);
            }
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        return str;
    }
}
