package day048;

public class Kare {

    private int kenar;

    public int getKenar() {
        return kenar;
    }

    public void setKenar(int kenar) throws Exception {
        if (kenar<=0) throw new Exception("Karenin kenarı sıfırdan büyük olmalıdır.");
        this.kenar = kenar;
    }

    public int alanHesapla(){
        return kenar*kenar;
    }
}
