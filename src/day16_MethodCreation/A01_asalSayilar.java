package day16_MethodCreation;

import java.util.Scanner;

public class A01_asalSayilar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        boolean asal = true;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asal = false;
                break;
            }
        }
        if (asal) {
            System.out.println("Girilen sayi : " + sayi + " asaldir");
        } else {
            System.out.println("Girilen sayi : " + sayi + " asal değildir");
        }
    }
}

