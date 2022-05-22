package day08_ifElseStatements;

import java.util.Scanner;

public class C03_SayiKontrol {
    public static void main(String[] args) {

        // Soru 6) Kullanicidan iki sayi isteyin,
        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        // sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
        // sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        //sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz..:");

        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        //  sayilarin ikiside pozitif ise sayilarin toplamini yazdirin,
        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("Girdiginiz iki sayida pozitif oldugundan toplamlari= " + (sayi1 + sayi2));
        }
        //  sayilarin ikiside negatif ise sayilarin carpimini yazdirin,
        else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println("Girdiginiz iki sayida negatf oldugundan carpimlari= " + (sayi1 * sayi2));
        }
        // sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
        else if (sayi1 * sayi2 < 0) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        }
        else {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }
    }

}
