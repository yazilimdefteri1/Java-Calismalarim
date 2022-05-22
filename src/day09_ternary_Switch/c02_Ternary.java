package day09_ternary_Switch;

import java.util.Scanner;

public class c02_Ternary {
    public static void main(String[] args) {

        // Ternary ile yapıilan tum islemler if else ile de yapılabilir
        // if else yerine Ternary tercih etme sebebi yapinin basit ve anlasilir olmasidir
        // Ternary icerisinde kompleks kodlar olmaz
        // sadece sonuc veya bizi sonuca goturen basit islemler olabilir

        // kullaniicidan bir tam sayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen pozitif bir tamsayi giriniz");
        int sayi=scan.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("sayi cift");}
            else {
            System.out.println("sayi tek");
        }
        System.out.println(sayi%2==0 ? "sayi cift" : "sayi tek");

    }

}
