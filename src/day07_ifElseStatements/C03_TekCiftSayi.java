package day07_ifElseStatements;

import java.util.Scanner;

public class C03_TekCiftSayi {
    public static void main(String[] args) {

        //Soru1)  Kullanicidan bir tamsayi isteyin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
                int sayi = scan.nextInt();

                if (sayi%2==0) {
                    System.out.println(("girilen sayi cifttir"));
                }
                if (sayi%2 !=0) {
                    System.out.println(" girilen sayi tektir");
                }
    }
}
