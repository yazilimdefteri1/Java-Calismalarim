package day14_stringManipulation;

public class C05_SifreKontrol {

    public static void main(String[] args) {

        //kullanıcıdan bir sifre girmesini isteyin Asagıdakı sartları saglıyorsa sifre basarı ıle tanımlandı yazınız
        //sartları saglamaz ise islem basarısız lutfen yenı bir sıfre gırın yazdırın
        //ilk harf buyuk olmalı
        //son harf kucuk olamalı
        //sifre bosluk ıcermemelı
        //sifre uzunlugu en az 8 karakter olmalı

        String sifre="Asdf123455a";
        boolean ilkHarf= false;
        if (sifre.charAt(0)>= 'A' && sifre.charAt(0)<='Z'){
            ilkHarf=true;
        }else {
            System.out.println("Sifrenizin ilk harfi Buyuk Harf olmali");
        }
        boolean sonHarf=false;
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            sonHarf=true;
        }else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }
        boolean bosluk= false;
        if (!sifre.contains(" ")){
            bosluk=true;
        } else {
            System.out.println("sifre bosluk icermemeli");
        }
        boolean uzunluk=false;
        if (sifre.length()>=8){
            uzunluk=true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
        }
        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }
    }
}
