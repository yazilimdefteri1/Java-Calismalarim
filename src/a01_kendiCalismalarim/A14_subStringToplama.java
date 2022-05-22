package a01_kendiCalismalarim;

import java.util.Scanner;

public class A14_subStringToplama {
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

        double toplam = Double.valueOf(sonuc2) + Double.valueOf(sonuc3);
        String son = "$" +toplam;
        System.out.println(son);
        System.out.print("\nLutfen bir metin giriniz : ");
        String cumle=scan.nextLine();
        int karakterSayi=cumle.length();
        System.out.println("Metin bosluklar dahil "+ karakterSayi + " den oluşmaktadır.");


    }
}
