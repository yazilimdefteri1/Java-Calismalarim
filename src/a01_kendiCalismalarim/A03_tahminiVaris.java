package a01_kendiCalismalarim;

import java.util.Scanner;

public class A03_tahminiVaris {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double yol,saat,hiz;
        // Ortalam hız hesaplama
        System.out.print("Yol mesafinizi giriniz (km) : ");
        yol = scan.nextDouble();
        System.out.print("Gitmek istediğiniz süreyi giriniz (saat) : ");
        saat = scan.nextDouble();
        System.out.println("Gitmeniz gereken ortalama hız = " + (yol / saat) + "km/s dir.");

        // Tahmimni ortalam Saat hesaplama
        System.out.print("Yol mesafinizi giriniz (km) : ");
        yol = scan.nextDouble();
        System.out.print("Gitmek istediğiniz hizi giriniz (km) : ");
        hiz = scan.nextDouble();
        System.out.println("Tahmini varis süre ortalaması = " + (yol / hiz) + "saat dir.");


    }
}
