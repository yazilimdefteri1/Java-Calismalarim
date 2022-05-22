package day07_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scan.nextInt();

        //=========if else ile cozum===========
        if (sayi%2==0) {
            System.out.println(("girilen sayi cifttir"));
        }
        else{
            System.out.println(" girilen sayi tektir");
        }
        // normalde bir tamsayi ya tektir veya cifttir, ucuncu bir durum yoktur
        //zaman tek olmasi ve cift olmasini iki ayri if ile degil
        // if else ile tek statement2Da yapmak daha guzel olur


    }
}
