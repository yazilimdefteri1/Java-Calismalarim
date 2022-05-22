package day40_overriding_polymorphism;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {

        System.out.println("************************");
        System.out.println("Sayiniz kontrol ediliyor");
        System.out.println("************************");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz..: ");
        int faktoriyelMi = scan.nextInt();

        int sayi = 1;
        int i=1;
        boolean sonuc = false;

            do {
                i++;
                sayi = sayi * i;
                if (sayi == faktoriyelMi) {
                    sonuc = true;
                }
            } while (sayi < faktoriyelMi);

        System.out.println("Sayinin faktoriyel sonucu = "+ sonuc);

    }
}
