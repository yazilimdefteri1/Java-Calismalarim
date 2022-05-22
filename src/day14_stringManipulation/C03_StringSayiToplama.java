package day14_stringManipulation;

import java.util.Scanner;

public class C03_StringSayiToplama {
    public static void main(String[] args) {

        //Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
//String str1 = "$13.99"
//String str2 = "$10.55"
//ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
        Scanner scan= new Scanner(System.in);
        String str2 = "$13.99";
        String str3 = "$10.55";

        String sonuc2 = str2.substring(1);
        String sonuc3 = str3.substring(1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);

        //****Hocanin yaptigi şekli ile********
        //str2=str2.replaceAll("\\D","");
        //str3=str3.replaceAll("\\D","");
        //System.out.println(str2);
        //System.out.println(str2);

        double toplam =Double.valueOf(sonuc2) + Double.valueOf(sonuc3);
        String son = "$" +toplam;
        System.out.println(son);

        System.out.print("\nLutfen bir metin giriniz : "); //  metin karakter sayisini bulan program
        String cumle=scan.nextLine();
        int karakterSayi=cumle.length();
        System.out.println("Metin bosluklar dahil "+ karakterSayi + " karakter den oluşmaktadır.");


    }
}
