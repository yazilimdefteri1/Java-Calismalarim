package day09_ternary_Switch;

public class C03_Ternary {
    public static void main(String[] args) {

        int sayi=220;
        // verilen sayinin 3 veya dha cok basamakli olup olmadigini kontrol eden
        // ve sonucu yazdiran bir ternary olusturun

       String sonuc = sayi>=100  ?  "Sayi 3 basamakli veya daha buyuk" : "Sayi negatif veya 3 basmaktan kucuk";

       //Ternary bize sonuc dondurdugu icin
        // ya bu sonucu direk yazdirmaliyiz
        // ya da sonucun data uygun bir variable'a atam yapabiliriz.

        System.out.println(("Girdiginiz sayi analizi : "+sonuc));
    }
}
