package day048;

public class Main6 {
    public static void main(String[] args) {

        try {
            System.out.println(Main6.bol(5,0));
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }


    }

    public static int bol(int x,int y) throws Exception {
        if (y==0) throw new Exception("İşlem Hatası");
        return x/y;
    }

}
