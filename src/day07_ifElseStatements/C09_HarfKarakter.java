package day07_ifElseStatements;

import java.util.Scanner;

public class C09_HarfKarakter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char karakter = scan.next().toUpperCase().charAt(0);
        if (karakter >= 'A' && karakter <= 'Z') {
            System.out.println("girdiginiz karakter bir harftir");
        } else {
            System.out.println("girdiginiz karakter bir harf degildir");
        }
    }
}


