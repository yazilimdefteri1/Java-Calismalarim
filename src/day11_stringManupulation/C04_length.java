package day11_stringManupulation;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {

        // Kullanicidan ismini alip baş harfini ve son harfini Büyük harflerle yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("İlk Harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("Son Harf : " + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length());  //0

        String str2=null;
        System.out.println(str2);
        //System.out.println(str2.length());  //calistiginda hata verir

        String str3;
        //System.out.println(str3);
        //str3 ile str2'ye deger atanmamistir
        // str2 null pointer ile isaretlediginden java durumun kontrol altinda oldugunu bilir
        // ve geriye kalan kodun calismasina engel olmaz
        // ancak str3' e bir deger atamasi olmayinca java altini kirmizi cizer
        // ve bu durum düzltilinceye kadar kodun geriye kalaninin calismasina izin vermez
        //

    }
}
