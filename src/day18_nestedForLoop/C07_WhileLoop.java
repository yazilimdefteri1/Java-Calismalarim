package day18_nestedForLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan kac sayi ytoplamak istedigini alin
        // bu sayilari alin ve bu sayilarin toplamibini ekrana yazdirin

        int sayiAdedi = 5;
        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        for (int i = 1; i <= sayiAdedi; i++) {
            System.out.print("Lutfen " + i + ".sayiyi giriniz : ");
            sayi = scanner.nextInt();
            toplam += sayi;
        }
        System.out.println("girilen " + sayiAdedi + " sayinin toplami : " + toplam);
        // While ile yapalim
        sayi = 0;
        toplam = 0;
        int sayac = 1;

        while (sayac <= sayiAdedi) {
            System.out.print("Lutfen " + sayac + ".sayiyi giriniz : ");
            sayi = scanner.nextInt();
            toplam += sayi;
            sayac++;
        }
        System.out.println("girilen " + sayiAdedi + " sayinin toplami : " + toplam);
    }
}
