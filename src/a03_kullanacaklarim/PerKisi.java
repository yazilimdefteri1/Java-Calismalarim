package a03_kullanacaklarim;

import java.util.HashMap;

import static a03_kullanacaklarim.PerIslem.scan;

public class PerKisi {

    private String ad = "";
    private String soyad = "";
    private String statu = "";
    private String  brans= "";
    private String maas = "";

    public PerKisi() {

    }

    public PerKisi(String ad, String soyad, String statu, String brans, String maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.statu = statu;
        this.brans = brans;
        this.maas = maas;
    }

    public String getAd() {
            return ad;
        }

        public void setAd() {
            this.ad = ad;
            System.out.print("Lütfen ad giriniz..:");
            ad = scan.next();
        }

        public String getSoyad() {
            return soyad;
        }

        public void setSoyad() {
            this.soyad = soyad;
            System.out.print("Lütfen soyad giriniz..:");
            soyad = scan.next();
        }

        public String getStatu() {
            return statu;
        }

        public void setStatu() {
            this.statu = statu;
            System.out.print("Lütfen statu giriniz..:");
            statu = scan.next();
        }

        public String getBrans() {
            return brans;
        }

        public void setBrans() {
            this.brans = brans;
            System.out.print("Lütfen brans giriniz..:");
            brans = scan.next();
        }


        public String getMaas() {
            return maas;
        }

        public void setMaas() {
            this.maas = maas;
            System.out.print("Lütfen maas giriniz..:");
            maas = scan.next();
        }

    }


