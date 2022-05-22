package day11_stringManupulation;

import java.util.Locale;

public class C01_toLowerCase_toUpperCaase {
    public static void main(String[] args) {

            String str= "Java Guzeldir";

            //Biz string method'larini arka arkaya kullanabiliriz
            //mesela ikinci kelimenin ilk harfini kucuk olarak yazdiralim


        //str.charAt(5);  boyle yazdigimizda sonuc artik String degil char olacaktir.
        //dolayisiyla String'de yapmak istedigimiz tum degisiklikleri
        // once yazip sonra charAt() methodunu kullanmaliyiz

        System.out.println(str.toLowerCase().charAt(5));

        String isim= "TechProEducatIon";
        System.out.println(str.toUpperCase());
        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());
        isim="TECHPROEDUCATİON";
        System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));

    }

}
