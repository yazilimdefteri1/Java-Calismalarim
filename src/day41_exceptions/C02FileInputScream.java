package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02FileInputScream {
    public static void main(String[] args) {
        /*
        Bir kod yazilirken olasi exception'lar ongorulup
        exception olustugunda Java'nin ne yapmasini istedigimiz belirtilmelidir

        1- Eger exception olustugunda kodun calismaya devam etmesini istemiyorsak
        method isminin yanina olusabilecek exception'ı deklare edebiliriz
        2- Eger exception olustugunda kodun calismaya devam etmesini istiyorsak
        sorun oluturabilecek kodu try catch blogunun icine alir
        try bloguna sorun cikabilecek kodu
        catch bloguna olusabilecek exception'ı ve
        olasi exception durumunda Javanin ne yapmasini istedigimizi yazabiliriz.
         */

        String dosyaYolu="src/day41_exceptions/dosya.txt";

        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
