package day40_overriding_polymorphism;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_Exception {
    // kullanicidan istedigi kadar sayiyi alip toplayan bir program yaziniz
    // toplam 500 'u gecerse programi bitirsin veya
    // kullanici bitirmek istediginde Q'ya basmalidir.
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int toplam = 0;

        do {
            System.out.println("Lutfen toplamak istediginiz sayiyi giriniz \n bitirmek icin @'ya basiniz");
            int sayi = 0;

            try {
                sayi = scan.nextInt();
            } catch (InputMismatchException e) {
                String hataliGiris = scan.next();
                if (hataliGiris.equalsIgnoreCase("q")) {
                    //System.out.println("girdiginiz sayilarin toplami : " + toplam);
                    break;
                } else {
                    System.out.println("hatali giris");
                }
            }
            toplam+=sayi;
        } while (toplam < 500);
        System.out.println("girdiginiz sayilarin toplami : " + toplam);
    }
}
