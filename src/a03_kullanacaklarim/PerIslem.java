package a03_kullanacaklarim;

import java.util.HashMap;
import java.util.Scanner;

public class PerIslem  {
    public static HashMap<Integer, String> personel = new HashMap<Integer, String>();
    public static Scanner scan = new Scanner(System.in);
    public static PerKisi PerKisi=new PerKisi();
    public static int sicilNo = 0;


    public static HashMap<Integer, String> PersonelEkleme(HashMap<Integer, String> personel ) {

        System.out.print("Lütfen Personelin Sicil No'sunu giriniz..: ");
        sicilNo = scan.nextInt();
        PerKisi.setAd();
        PerKisi.setSoyad();
        PerKisi.setStatu();
        PerKisi.setBrans();
        PerKisi.setMaas();
        String value = PerKisi.getAd() + ", " + PerKisi.getSoyad() + ", " + PerKisi.getStatu() + ", " +
                PerKisi.getBrans() + ", " + PerKisi.getMaas();

        personel.put(sicilNo, value);
        System.out.println(personel);
        return (personel);
    }

    public static HashMap<Integer, String> PersonelGuncelleme(HashMap<Integer, String> personel) {
        System.out.print("Lütfen Güncellemek istediğiniz Personelin Sicil No'sunu giriniz..: ");
        sicilNo = scan.nextInt();
        PerKisi.setAd();
        PerKisi.setSoyad();
        PerKisi.setStatu();
        PerKisi.setBrans();
        PerKisi.setMaas();
        String value= PerKisi.getAd() + ", " +PerKisi.getSoyad() + ", " +PerKisi.getStatu() + ", " +
                PerKisi.getBrans() + ", " +PerKisi.getMaas();

        personel.put(sicilNo, value);
        System.out.println(personel);
        return (personel);
    }


    }

