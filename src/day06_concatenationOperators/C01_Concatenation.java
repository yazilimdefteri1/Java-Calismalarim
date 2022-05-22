package day06_concatenationOperators;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        int sayi2=3;

        //variable'larin degerlerini degistirmeden
        // asagidaki ifadeleri, bu variable'lari kullanarak yazdirin

        //Java5Guzel
        System.out.println(str1+sayi1+str2);

        // 2Guzel15
        System.out.println(sayi1-sayi2+str2+sayi1*sayi2);

        // Java22
        System.out.println(str1+(sayi1-sayi2)+(sayi1-sayi2));

        // 53Guzel
        System.out.println("" + sayi1 + sayi2 + str2);

        /* Eger tamamen sayilardan olusan bir String varsa ve biz bunu int'a cevirmek istersek
          Integer.valueof(str)

          bir Sayiyi String'e cevirmek icin
          ""+sayi
         */

        boolean sonuc1 =5+2==7;
        boolean sonuc2 =5*2==15;

        System.out.println(sonuc1);
        System.out.println(sonuc2);

    }
    }

