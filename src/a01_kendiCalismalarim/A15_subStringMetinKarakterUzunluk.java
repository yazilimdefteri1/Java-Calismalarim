package a01_kendiCalismalarim;

import java.util.Scanner;

public class A15_subStringMetinKarakterUzunluk {
    public static void main(String[] args) {

        // Kuulanici tarafindan girilen metnin Spaceler dahil karakter uzunluğune veren program
        Scanner scan = new Scanner(System.in);

        String str1 = ",";

        System.out.print("\nLutfen bir metin giriniz : ");
        String cumle = scan.nextLine();
        int karakterSayi = cumle.length();
        System.out.println("Metin bosluklar dahil " + karakterSayi + " den oluşmaktadır.");

        int a = cumle.indexOf(str1);
        int b = 0;
        b = ++b;

        while (karakterSayi > b) {
            String sonuc = cumle.substring((a+1),karakterSayi);
            a = sonuc.indexOf(str1);
            System.out.println(sonuc);
            b = ++b;


        }
        System.out.println(b);


           // int degerInt = Integer.valueOf(sonuc);
           // System.out.println(degerInt);

        }

}
