package day16_MethodCreation;

import java.util.Scanner;

public class A01_fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen finacci serisi yazdırmak istedidiniz sayiyi giriniz : ");
        int sayi = scanner.nextInt();

        int s1=0;
        int s2=1;
        int toplam=0;

        System.out.print( sayi + " Sayisinin Fibonacci serisi " );

        for(int i=1; i<=sayi; i++){

            System.out.print(s1 + ",");

            toplam=s1+s2;
            s1=s2;
            s2=toplam;

        }
    }
}
