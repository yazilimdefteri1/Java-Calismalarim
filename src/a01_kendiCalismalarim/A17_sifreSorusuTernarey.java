package a01_kendiCalismalarim;

import java.util.Scanner;

public class A17_sifreSorusuTernarey {
    public static void main(String[] args) {

        //kullanıcıdan bir sifre girmesini isteyin Asagıdakı sartları saglıyorsa sifre basarı ıle tanımlandı yazınız
        //sartları saglamaz ise islem basarısız lutfen yenı bir sıfre gırın yazdırın
        //ilk harf buyuk olmalı
        //son harf kucuk olamalı
        //sifre bosluk ıcermemelı
        //sifre uzunlugu en az 8 karakter olmalı

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen sifrenizi giriniz : ");
        String sifre = scan.nextLine();

        System.out.println((sifre.length() >= 8) ?
                          ((!sifre.contains(" ") ?
                          ((sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') ?
                          ((sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') ?
                                        "sifre basarı ıle tanımlandı" :
                                        "sıfre kucuk harf ile bitmeli") :
                                        "sifre buyuk harf ile baslamalı") :
                                        "sifre bosluk ıcermemelı")) :
                                        "sifre uzunlugu en az 8 karakter olmalı");
    }
}
