package a01_kendiCalismalarim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A18_sifreSorusuSoutile {

    public static void main(String[] args) {

        //Kullanıcıdan bir şifre girmesini isteyin. Asağıdaki srtları saglıyorsa "şifre
        //basarı ile tnımlandı", sartlari saglamazsa "İslem bsarısız, Lütfen yeni bir
        // sifre girin" yazdırın
        //-Ilk harf buyuk harf olmalı
        //-Son harf kucuk harf olmalı
        //-Sifre boşluk icermemeli
        //-Sifre uzunlugu en az 8 karakter olmal

       Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen şifrenizi giriniz : ");
        String passWord = scan.next();

        System.out.println(((passWord.charAt(0)>='A' || passWord.charAt(0) <= 'Z')
                && (passWord.charAt(passWord.length()-1) >='a' || passWord.charAt(passWord.length()-1) >='z')
                && (!passWord.contains(" ")) && (passWord.length() >= 8)) ? "şifre basarı ile tanımlandı" : "İslem basarısız, Lütfen yeni bir şifre girin");



    }
}
