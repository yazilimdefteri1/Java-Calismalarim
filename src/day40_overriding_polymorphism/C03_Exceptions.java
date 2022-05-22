package day40_overriding_polymorphism;

import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip, bolerek
        // sonucu yazdiran bir program yaziniz

        Scanner scan=new Scanner(System.in);
        int kontrol=0;
        while (kontrol!=2){
            System.out.print("Bolmek istediginiz sayiyi giriniz : ");
            int sayi1=scan.nextInt();

            System.out.print("Kaca bolmek istediginizi giriniz : ");
            int sayi2=scan.nextInt();

            try {
                System.out.println("sonuc = " + sayi1/sayi2);
            } catch (Exception e) {
               // e.printStackTrace();
                System.out.println("Girdiginiz sayilarda sorun var");
            }

            System.out.println("Devam etmek icin 1 bitirmek icin 2'ye basiniz");
            kontrol=scan.nextInt();

        }


        /*

        Sayi2 0 oldugunda sayi1/0 tanimsiz olacagindan
        Java bu durumla karsilasinca exception verir
        Javanin yazdigi mesajda exception ne tur bir sorun oldugu
        Neden kaynaklandigi
        ve hangi satirda olustugu yazar

        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day40_overriding_polymorphism.C03_Exepcitions.main(C03_Exepcitions.java:17)
         */



    }
}
