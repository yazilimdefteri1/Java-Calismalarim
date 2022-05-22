package day07_ifElseStatements;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C04_HaftaIciHaftaSonu {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin

        // pazar veya cumartesi ise==> hafta sonu
        // pazartesi , sali, carsamba, persembe, cumaise ==> hafta ici

        //String case sensitive'dir
        // yani pazar, Pazar, Pazar, PAzar  vs.  bunlar hep farkli kelimelerdir

        // bu durumda String methodlardan yardim aliriz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen gun ismini yazini : ");

        String gunIsmi = scan.next().toLowerCase(); //kullanıcı nasıl yazarsa yazsin biz kucuk harfe donusturyoruz

        //String ifadelerde == kullanilmasi  tavsiye edilmez
        // cunku bekledigimizden farkl,i sonuc verebilir

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println(" Girdiginiz gun hafta sonu");
        }
        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println(" Girdiginiz gun hafta ici");
        }
    }
}
