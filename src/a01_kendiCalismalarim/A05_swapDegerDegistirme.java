package a01_kendiCalismalarim;

import java.util.Scanner;

public class A05_swapDegerDegistirme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi1,sayi2,gecici;

        System.out.print("1. Sayiyi giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        sayi2 = scan.nextInt();

        System.out.println("Değişimden önce 1. Sayi = " + sayi1);
        System.out.println("Değişimden önce 2. Sayi = " + sayi2);

        System.out.println("Degerler degistiriliyor...");

        gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;

        System.out.println("Değişimden sonra 1. Sayi = " + sayi1);
        System.out.println("Değişimden sonra 2. Sayi = " + sayi2);
    }
}
