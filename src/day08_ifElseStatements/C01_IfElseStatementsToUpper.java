package day08_ifElseStatements;

import java.util.Scanner;

public class C01_IfElseStatementsToUpper {

    public static void main(String[] args) {

        // girilen bir karakterin, harf olup olmadigini bulalim

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz..:");
        char karakter=scan.next().toUpperCase().charAt(0);
        if ((karakter>='A'  &&  karakter<='Z')) {
            System.out.println("Girdiginiz karakter bir harf");
        }
        else {
            System.out.println("Girdiginiz karakter bir harf degildir");
        }

        /* daha kısa yollu olan Direk karakter okuyan

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz: ");
        char karakter=scan.next().charAt(0);
        if (Character.isLetter(karakter)){
            System.out.println("girdiginiz karakter harftir");
        }else {
            System.out.println("girdiginiz karakter harf degildir");
        }  */
    }

    }

