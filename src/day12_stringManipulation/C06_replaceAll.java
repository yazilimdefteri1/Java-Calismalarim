package day12_stringManipulation;

import java.util.Scanner;

public class C06_replaceAll {
    public static void main(String[] args) {

        //Kullanicidan isim soyisim bilgisini alip
        // butun harfleri * yapalim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutefen isim ve soyisminizi giriniz");
        String isimSoyisim= scan.nextLine();

        System.out.println(isimSoyisim.replaceAll("\\S","*"));

    }
}
