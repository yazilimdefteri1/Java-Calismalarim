package day12_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        /*Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
          - Girilen kelime cumlede kullanilmamis.
          - Girilen kelime cumlede 1 kere kullanilmis.
          - Girilen kelime cumlede 1’den fazla kullanilmis. */

        String cumle = "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime = "yeni"; //yeni , " " , "n", "program"  "ayhan" için caliştirdik

        int ilkKullanim = cumle.indexOf(kelime); //  -1 cikar veya index
        // eger -1 cikiyorsa hiç kullanilmamiş demektir
        int ikinciKullanim= cumle.indexOf(kelime, ilkKullanim+1);
        int ucuncuKullanim= cumle.indexOf(kelime, ikinciKullanim+1); //***bunu kendim ekledim***

        if (ilkKullanim==(-1)) {
            System.out.println("Girilen kelime cümlede kullanilmamis");
        }
        else if (ikinciKullanim==(-1)) {
            System.out.println("İstenen kelime cumlede 1 kere kullanilmis.");
        }
        else {
            System.out.println("Girilen kelime cümlede 1'den fazla kullanilmis.");
        }

        System.out.println(ilkKullanim);  // bu index degerlerini görmek icin ben yazdim
        System.out.println(ikinciKullanim); // bu index degerlerini görmek icin ben yazdim
        System.out.println(ucuncuKullanim); // bu index degerlerini görmek icin ben yazdim
    }
}
