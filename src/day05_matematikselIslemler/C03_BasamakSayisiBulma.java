package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_BasamakSayisiBulma {

   public static void main(String[] args) {

            // Kullanıcıdan aldiginiz bir sayinin
            // önce basamak sayisni bulunuz.

            Scanner scan = new Scanner(System.in);
            System.out.println(" Lutfen bir tamsayi giriniz  : ");

            int sayac=0;
            int sayi= scan.nextInt();
            int sayi2=sayi;
          int rakam=0;
          int rakamlarToplami=0;

       while(sayi > 0) {
           sayi /= 10; // sayi = sayi / 10;
           sayac++;
       }
       System.out.println("Girdiginiz sayinin basamak sayisi = " + sayac);


           for( int i=sayac ;  i> 0 ; --i) {
               rakam = sayi2 % 10; //2
               rakamlarToplami += rakam; // 2
               sayi2 /= 10; // 753

           }


       System.out.println("Girdiginiz sayinin rakamlar toplami  " + rakamlarToplami);

        }
    }

