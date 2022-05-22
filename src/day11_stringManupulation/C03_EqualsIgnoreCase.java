package day11_stringManupulation;

import java.util.Scanner;

public class C03_EqualsIgnoreCase {
    public static void main(String[] args) {

        // Kullaniciya derse katılıp katılmak istemedigini soran
        // evet derse, cevabini ve   "Derse katiliminiz alinmiştir" yazdirin
        // hayir derse, cevabini ve " Sonraki derslerimize bekleriz"

        Scanner scan= new Scanner(System.in);
        System.out.println("Derse katilmak istermisiniz ? \n Evet veya Hayir yaziniz");
        String cevap= scan.next();

        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " + cevap + " derse katilimizniz onaylanmistir" );
        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : " + cevap + " Sonraki derslerimize bekleriz" );
        } else {
            System.out.println("lutfen evet veya hayir yaziniz");
        }

        }

    }

