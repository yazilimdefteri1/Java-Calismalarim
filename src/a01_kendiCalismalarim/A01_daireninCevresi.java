package a01_kendiCalismalarim;

import java.util.Scanner;

public class A01_daireninCevresi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        double yaricap = scan.nextDouble();

        System.out.println("Dairenin Cevresi = " + (2 * Math.PI * yaricap));
        System.out.println("Dairenin Alani = " + (Math.PI * yaricap*yaricap));
    }
}
