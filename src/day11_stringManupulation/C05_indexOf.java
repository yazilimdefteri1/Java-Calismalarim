package day11_stringManupulation;

import java.util.Scanner;

public class C05_indexOf {
    public static void main(String[] args) {

        String str1="Java bir baska guzel valla cok guzel";

        //istersek char olarak verdigimiz bir harfin indexini bize döndürür
        System.out.println(str1.indexOf('J')); // 0
        // istersek bir harf ya da metin olarak verdigimiz String'in indexini döndürür
        System.out.println(str1.indexOf("l")); //19
        System.out.println(str1.length()-1); //35

        System.out.println(str1.indexOf("aska")); // 10

        //ayni harften birden fazla varsa ?
        System.out.println(str1.indexOf("b")); // 5 buldugu ilk dogru eslesmenin indexini dondurur

        //
        System.out.println(str1.indexOf('b' , 5));
        //  Bu method' da java aramaya fromIndex olarak yazdigimiz index'den baslar
        // (inclusive)

        // verilen Strind deki 2. a harfinin indexini bulalım
        int  ilkindex=str1.indexOf('a');
        System.out.println(str1.indexOf('a' , ilkindex +1)); //3

        // verilen Strind deki 2. a harfinin indexini bulalım
        int  ilkbindexi=str1.indexOf("b");
        System.out.println(str1.indexOf('b' , ilkbindexi +1)); //9

        // 20. index'ten sonra guzel aratalim
        System.out.println(str1.indexOf("guzel" , 20)); //31


        //  String'de olmayan bir harf aratsak
        System.out.println(str1.indexOf('y')); // y yok demesi lazım ama return type'i index
                // yok demenin sayisal karsiligi olarak java -1 dondurmeyi tercih etmistir.

        //kullanicidan mail adresini isteyip @ isaretini icermiyorsa ,

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen mailinizi yazin");

        String mail= scan.next();

        if (mail.indexOf("@")==(-1)) {
            System.out.println("Gecersiz");
        }
        else {
            System.out.println("Mailiniz kabul edildi");
        }

        // OZET:  indexof method'u  icersine yazilan String veya char'in
        // metinde hangi index'te oldugunu bize donduru
        // eger aradigimiz metin veya char yoksa , olmadiginin delili olarak
        // bize -1 dondurur

    }
}
