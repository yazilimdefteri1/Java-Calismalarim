package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseHaftaninGunleri {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin

        // pazar veya cumartesi ise==> hafta sonu
        // pazartesi , sali, carsamba, persembe, cumaise ==> hafta ici

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yazini : ");
        String gunIsmi = scan.next().toUpperCase();

        if (gunIsmi.equals("PAZAR") || gunIsmi.equals("CUMARTESI")) {
            System.out.println(" Girdiginiz gun hafta sonu");
        } else {
            System.out.println("girdiginiz gun hafta ici");
        }
    }
}
