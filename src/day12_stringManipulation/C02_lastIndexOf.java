package day12_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

          /*Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
          - Girilen kelime cumlede kullanilmamis.
          - Girilen kelime cumlede 1 kere kullanilmis.
          - Girilen kelime cumlede 1’den fazla kullanilmis. */

        String cumle = "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime = "yeni"; //yeni , " " , "n", "program"  "ayhan" için caliştirdik

        int ilkKullanim = cumle.indexOf(kelime); //  -1 cikar veya index
        // eger -1 cikiyorsa hiç kullanilmamiş demektir

        int sonKullanim= cumle.lastIndexOf(kelime);

        if (ilkKullanim==(-1)) {
            System.out.println("Girilen kelime cümlede kullanilmamis");
        }
        else if (ilkKullanim==sonKullanim) {
            System.out.println("İstenen kelime cumlede 1 kere kullanilmis.");
        }
        else {
            System.out.println("Girilen kelime cümlede 1'den fazla kullanilmis.");
        }

        String str="Eclipse";
        System.out.println(str.lastIndexOf("p",4)); // girdigimiz from index '4' dahil olarak aratma yapar.


        System.out.println(ilkKullanim);  // 12 index degerini görmek icin ben yazdirdim
        System.out.println(sonKullanim);  // 29 index degerini görmek icin ben yazdirdim


    }
}
