package day18_nestedForLoop;

import java.util.Scanner;

public class C08_ForLoopVsWhileLoop {
    public static void main(String[] args) {

        //  Kuulanicidan toplamak istedigi sayilari alin
        // ve kullanici sifir'a basincaya kadar devam edin
        // kullanici sifir'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;

        for (int i = 1; i < 1000000; i++) {
            System.out.print("Lutfen " + i + ".sayiyi giriniz : ");
            sayi = scanner.nextInt();
            if (sayi == 0) {
                break;
            } else {
                toplam += sayi;
            }
        }
        System.out.println("girilen sayilarin toplami : " + toplam);

        sayi = 1;
        toplam = 0;
        int i=0;

        while (sayi != 0) {
            i++;
            System.out.print("Lutfen " + i + " sayiyi giriniz : ");
            sayi = scanner.nextInt();
            toplam += sayi;
        }
        System.out.println("girilen " + i + " sayinin toplami : " + toplam);

        // baslangic,bitis ve degisim degerleri  net olan durumlarda for loop daha avantajlıdır
        // ama adim sayisi belli olmayan durumlarda while loop daha avantajlidir
    }
}
