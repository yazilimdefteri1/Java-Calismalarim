package day04_dataCasting_Increment;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        // soru-7) kullanicidan ismini alip isminin basharfini yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println(" Lutfen Isminizi Giriniz....");
        char ilkHarf= scan.next().charAt(0);

                //charArt(index) method'u parametre olarak yazdigimiz index'deki char'i bize verir

        // Ersin
        // 01234

        System.out.println(" Girdiginiz Ismin ilk Harfi  :"  +  ilkHarf);

    }
}
