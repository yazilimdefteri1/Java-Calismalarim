package day33_varargs_stringBuilder;

public class C05_StringBuilder {
    public static void main(String[] args) {
        /* compare iki stringBuilder'ı esit'mi diye
           ilk harften baslayarak tüm karakterleri karsilastirir
           Ayni olan karakterler icin bir sey yazdirmaz
           farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride oldugunu yazdirir.
           Tamamen ayni ise bize 0 dondurur

           bir stringbuilder iel bir string'i compare edersekkabul etmez. String builder yazmamiz gerektigini soyler ve
           CTE verir
         */
        StringBuilder sb1=new StringBuilder("Ali Can");
        StringBuilder sb2=new StringBuilder("Ali Ean");

        String str="Ali Can";

        System.out.println(sb1.compareTo(sb2));
        //System.out.println(sb1.compareTo(str));
    }
}
