package day08_ifElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseEmeklilik {
    public static void main(String[] args) {

        //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi Giriniz..: " + "\nKadin icin K" + "\nErkek icin E harfini giriniz");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lütfen yasinizi giriniz..:");
        double yas = scan.nextDouble();

        //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        if (cinsiyet == 'K') {
            if (yas < 0 || yas > 120) {
                System.out.println("Lutfen girdiginiz yas degerini kontrol edin");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsin  \nDaha " + (60 - yas) + " yil calisman gerekir");
            } else {
                System.out.println("Emekli olabilirsin");
            }

        } else //Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
            if (cinsiyet == 'E') {
                if (yas < 0 || yas > 120) {
                    System.out.println("Lutfen girdiginiz yas degerini kontrol edin");
                } else if (yas < 65) {
                    System.out.println("Emekli olamazsin  \nDaha " + (65 - yas) + " yil calisman gerekir");
                } else {
                    System.out.println("Emekli olabilirsin");
                }
            } else {

                System.out.println("Lutfen Cinsiyet icin gecerli bir Harf giriniz");
            }
    }
}
