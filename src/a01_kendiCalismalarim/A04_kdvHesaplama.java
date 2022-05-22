package a01_kendiCalismalarim;

import java.util.Scanner;

public class A04_kdvHesaplama {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
        double fiyat = scan.nextDouble();
        System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
        double kdvOrani = scan.nextDouble();

        double yeni_fiyat = fiyat + (fiyat * kdvOrani/100);

        System.out.println("Yüzde" + kdvOrani + "KDV'li fiyat = " + yeni_fiyat);
    }
}
