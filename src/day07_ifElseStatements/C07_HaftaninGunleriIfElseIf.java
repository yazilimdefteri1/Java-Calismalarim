package day07_ifElseStatements;

import java.util.Scanner;

public class C07_HaftaninGunleriIfElseIf {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // Eger kullanici gun ismini yanlis girerse yanlis giris yazdirin
        // Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        //*** String icin equals method’unu kullanin

        // pazar veya cumartesi ise==> hafta sonu
        // pazartesi , sali, carsamba, persembe, cumaise ==> hafta ici

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini yazini : ");
        String gunIsmi = scan.next().toLowerCase();

        //hatali girisleri de yadirmak icin
        // olasiliklari 3'e cikardik
        //

        if (gunIsmi.equals("pazar") || gunIsmi.equals("cumartesi")) {
            System.out.println(" Girdiginiz gun hafta sonu");

        } else if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
            System.out.println(" Girdiginiz gun hafta ici");
        } else {
            System.out.println(" Lutfen gecerli bir gun ismi giriniz");
        }

        //  eger if else if  ..... statement  else ile bitiyorsa
        // olasiliklardan bir tanesi mutlaka calisir
        // Java ilk buldugu true'a  ait sonucu yazdirir
        // ve kalan satirlara bakmaz

        // if else if ... cumleleri else ile bitmezse de calisir
        // ancak  bu durumda sadece bir olasilik calisabilir VEYA  hic bir islem yapılamayabilir
        //  Bu yüzden ELSE ile bitirmek önemlidir
        // mutlaka bir isleme sokmus olursunuz
    }
}
