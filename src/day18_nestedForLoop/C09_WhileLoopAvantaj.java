package day18_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoopAvantaj {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi girmesini isteyin
        // kullanicnin girdigi sayilarin toplami 500'u gecerse
        //

        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        int i = 0;

        while(toplam<500){
            i++;
            System.out.print("Lutfen " + i + " sayiyi giriniz : ");
            sayi = scanner.nextInt();
            toplam += sayi;
        }
        System.out.println("Artik yeter cpk sayi girdin, girdigin " + i + " sayinin toplami : " + toplam+ " oldu");
    }
}
