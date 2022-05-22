package day13_stringManipulation;

public class C02_subString {
    public static void main(String[] args) {

        // 1-48 of 104 results for "nutella"
        // bu arama sonucundaki bulunan sonuc sayisi
        // 100'den çok ise "Süper"
        // az ise "Az sonuc bulundu"

        String str = "1-48 of 18554 results for \"nutella\"";
        //******kendi çözümüm başlıyor********

        String arananMetin1 = "of";
        String arananMetin2 = "r";

        int a = str.indexOf(arananMetin1);
        int b = str.indexOf(arananMetin2);

        String sonuc = str.substring(a + 3, b - 1);
        System.out.println(sonuc);

        int degerInt = Integer.valueOf(sonuc);
        System.out.println(degerInt);

        if (degerInt > 100) {
            System.out.println("Süper");
        } else {
            System.out.println("Az sonuc bulundu");
        }
        //******kendi çözümüm bitiyor********

        int ilkSpace = str.indexOf(" ");
        int ikinciSpace = str.indexOf(" ", ilkSpace + 1);
        int ucuncuSpace = str.indexOf(" ", ikinciSpace + 1);
        String aramaSonucSayisiStr = str.substring(ikinciSpace + 1, ucuncuSpace);
        int aramaSonucSayisiInt = Integer.valueOf(aramaSonucSayisiStr);

        if (aramaSonucSayisiInt > 100) {
            System.out.println("Süper");
        } else {
            System.out.println("Az sonuc bulundu");
        }

    }
}
