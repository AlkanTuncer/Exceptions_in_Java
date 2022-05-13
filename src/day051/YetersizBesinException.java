package day051;

public class YetersizBesinException extends Exception{

    public final int HATA_KODU = 10;

    public YetersizBesinException() {
        super("Yetersiz besin miktarı.");
    }

}
