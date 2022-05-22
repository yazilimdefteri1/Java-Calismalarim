package a01_kendiCalismalarim;

import java.util.Scanner;

public class A12_sayiyiMetinYazdirma {

    // Soru: Girilen iki basamakli sayısı yazıya dönüştürme programını yazınız
    // 1 sefer mahsus 2 basamaklı girmez ise sayiyi yeniden istesin
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("2 Basamaklı pozitif bir sayi giriniz: ");
        int sayi = scan.nextInt();


        while (sayi<10 || sayi> 99) {
            System.out.println("Lutfen sayiyi pozitif 2 Basamakli giriniz : ");
            sayi = scan.nextInt();
        }

        int birler = sayi % 10;
        int onlar = sayi / 10;

        switch (onlar) {
            case 1:
                System.out.print("On");
                break;
            case 2:
                System.out.print("Yirmi");
                break;
            case 3:
                System.out.print("Otuz");
                break;
            case 4:
                System.out.print("Kırk");
                break;
            case 5:
                System.out.print("Elli");
                break;
            case 6:
                System.out.print("Altmıs");
                break;
            case 7:
                System.out.print("Yetmis");
                break;
            case 8:
                System.out.print("Seksen");
                break;
            case 9:
                System.out.print("Doksan");
                break;
        }
        switch (birler) {
            case 1:
                System.out.print(" bir");
                break;
            case 2:
                System.out.print(" iki");
                break;
            case 3:
                System.out.print(" üç");
                break;
            case 4:
                System.out.print(" dört");
                break;
            case 5:
                System.out.print(" beş");
                break;
            case 6:
                System.out.print(" altı");
                break;
            case 7:
                System.out.print(" yedi");
                break;
            case 8:
                System.out.print(" sekiz");
                break;
            case 9:
                System.out.print(" dokuz");
                break;

        }
    }
}
