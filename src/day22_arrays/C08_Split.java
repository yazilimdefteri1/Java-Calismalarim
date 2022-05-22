package day22_arrays;

import java.util.Arrays;

public class C08_Split {
    public static void main(String[] args) {

        // verilen ir cumlede istene bir harfin kac defa kullanildigini yazdiran
        // bir method olusuturun

        String cumle = "Nerede o 'hello world' yazdiramayan ogrenciler?";
        String harf = "e";

        harfKacKereKullanilmis(cumle, harf);
    }

    private static void harfKacKereKullanilmis(String cumle, String harf) {

        int sayac = 0;

        String karakterler[] = cumle.split("");
        System.out.println(Arrays.toString(karakterler)); // harf harf yazdirdik
        for (int i = 0; i < karakterler.length; i++) {
            if (karakterler[i].equals(harf)) {
                sayac++;
            }
        }
        System.out.println("Aradiginiz 'e' harfi " + sayac + " kere kullanilmis");

    }
}
