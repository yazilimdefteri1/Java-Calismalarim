package day03_scanner;
import java.util.Scanner;
public class C04_Scanner {
    public static void main(String[] args) {

        //Scanner kullanmka icin 3 adım takip ediyoruz
        // 1.adim kendimize bir Scanner olusturmak

        Scanner scan = new Scanner(System.in);  // esitligin saginda yeni bir scanner olusturulur
                                                // ve olusturulan bu scanner scan variable 'na assign edilir
                                                // scan variablenin ismidir istediginiz ismi verebilirsiniz
        // 2.adim  : kullanicidan istedigimiz degeri girmesi icin aciklayici bir bilgi yazdirin

        System.out.println(" Lutfen Isminizi giriniz  : ");

        // 3.adim  :  kullanicinin girdigi degeri uygun bir variable olusturup kaydedin

        //String kullaniciIsmi= scan.next();  // SADECE ILK KELIMEYI ALIR (ILK SPACE'A KADAR OLANI ALIR
        String kullaniciIsmi= scan.nextLine();

        // kullanicidan aldigimiz degeri gorelim

        System.out.println("Kullanicinin girdigi isim : " + kullaniciIsmi);

    }
}
