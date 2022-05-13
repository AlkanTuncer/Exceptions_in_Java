package day051;

public class Hayvan {

    private String isim;
    private int yas;
    private double agirlik;

    public Hayvan(String isim, int yas, double agirlik) {
        this.isim = isim;
        this.yas = yas;
        this.agirlik = agirlik;
    }

    public Hayvan() {
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getAgirlik() {
        return agirlik;
    }
    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }


    public void beslen(double besinMiktari) throws YetersizBesinException{
        if (besinMiktari < agirlik/5) throw new YetersizBesinException();
        System.out.println(String.format("%2.1f kg besin ile %s besleniyor.",besinMiktari,getIsim()));
    }
}
