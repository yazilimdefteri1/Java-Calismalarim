package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan  = new Scanner(System.in);
        System.out.println(" Lutfen cemberin yaricapini giriniz : ");

        double yaricap= scan.nextDouble();


        System.out.println(" Girdiginiz Yaricap :"+ yaricap);
        System.out.println(" Cemberin cevresi :"+ 2*3.14*yaricap);
        System.out.println(" Dairenin alani :"+ 3.14*yaricap*yaricap);
    }
}
