package day38_inheritance_overriding;


public class Ustabasi extends Isci {
    public String statu="Ustabasi";
    public String haklar="Ustabasi haftada birgun extra tatil hakkina sahiptir";





    public void mesai(){
        System.out.println("Ariza varsa Ustabasi extra ucret almadan calisir");
    }
    public void maasHesapla(){
        System.out.println("Ustabasi 30 gun * 8 saat * 12 euro = " + (30*8*12)+ " Euro maas");
    }

    public static void main(String[] args) {

        // icinde oldugumuz class'dan klasik haliyle bir obje olusturursak
        // o obje ile cagirdigimiz variable ve methodlarda
        // Java once icinde bulundugumuz Class'a bakar
        // Aradigimiz class uyesi, icinde oldugumuz class'da varsa
        // bize onu getirir

        // YOKSA;
        // parent class'lara bakar ilk buldugunu getirir

        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu); // Ustabasi
        System.out.println(yasin.haklar); // "Ustabasi haftada birgun extra tatil hakkina sahiptir"
        System.out.println(yasin.ikramiye); // "Isciler yilda bir ikramiye alirlar"
        System.out.println(yasin.izin); // "Isciler yilda bir ikramiye alirlar"
        yasin.maasHesapla();
        yasin.mesai();
      /*
      Eger isci olarak ozelliklerini gormek istersek
      Class adini(Data Turunu ) Isci seceriz.
       */

        Isci ahmet= new Ustabasi();
        System.out.println(ahmet.statu); // Isci -----
        System.out.println(ahmet.haklar); // Isciler kidem tazminati alirlar" --------
        System.out.println(ahmet.ikramiye); // "Isciler yilda bir ikramiye alirlar"
        System.out.println(ahmet.izin); // "Tum personel yilda 4 hafta izin kullanabilirr"
        ahmet.maasHesapla();
        ahmet.mesai();
        /*
        Siz bir objeyi hangi class'dan tanimlarsaniz o class'a ait ozelliklere sahip olur.
         */

        Personel adem= new Ustabasi();
        System.out.println(adem.statu); // IPersonel
        System.out.println(adem.haklar); // "Tum personel esit haklara sahiptir"
        // System.out.println(adem.ikramiye); CTE verir--------
        System.out.println(adem.izin); // "Tum personel yilda 4 hafta izin kullanabilirr"
        adem.maasHesapla();
        adem.mesai();
        /*
        Personel adem= new Ustabasi(); Bu bir Ustabasi objesidir.
        Personel adem= new Personel(); Bu bir Personel objesidir.
        */

        /*
        Personel adem= new Ustabasi();

        adem'in data turu Personel'dir.
        boylece biz adem'i ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben adem'in Ustabasi oldugunu biliyorum
        cunku constructor'i Ustabasi
        Ama bu yazim formati ile
        adem'in tum Perswonel ile birlikte sahip oldugu
        ortak ozellikleri vurgulamak istiyorum

        Bu kullanim seklinde olusturulan obje data turu olarak secilen clas
        ve onun parent class'larindaki variable'lari
         */

    }
}
