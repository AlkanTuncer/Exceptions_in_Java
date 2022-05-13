package day051;

public class MainHayvan {
    public static void main(String[] args) {

        Hayvan hayvan = new Hayvan("Köpek",3,11.8);

        try {
            hayvan.beslen(4);
            new Hayvan("Atmaca",5,15).beslen(2);
        } catch (YetersizBesinException e) {
            System.err.println(String.format("%s HataKodu[%d]",e.getMessage(), e.HATA_KODU));
        }

    }
}
