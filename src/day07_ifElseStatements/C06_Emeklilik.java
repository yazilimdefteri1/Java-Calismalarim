package day07_ifElseStatements;

import java.util.Scanner;

public class C06_Emeklilik {
    public static void main(String[] args) {

        // kullanicidan yasini isteyin
        // 65 ve daha buyukse emekli olabilirsin
        // 65 ten kucuk ise emekli olamazsin yazdirim

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen yasinizi giriniz : ");
        int yas1= scan.nextInt();

        if (yas1>=65) {
            System.out.println("Emekli olabilirsin");
        }
        else {
            System.out.println("emekli olamazsin");
            System.out.println(65-yas1 + " sene daha calismalisin");
        }

        // if else Statement larda iki durumdan sadece3 biri calisir
        // ikisinin birden calisma ihtimali ====> YOKTUR
        // ikisininde calismama ihtimali ====> YOKTUR
    }
}
