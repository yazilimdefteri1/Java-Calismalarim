package day36_inheritance;

public class Memur extends Muhasebe {


    public static void main(String[] args) {

     Memur memur1= new Memur();
        // memur1 objesi Memur class'inin objesi olmasina rağmen
        // inherit ettiği Muhasebe ve onunda Parenr'i olan Personel
        // Class'larindaki tum datalari alabilir.

        //Personel Class'indan aldi
        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="3125756595";

        // Muhasebe Class'indan aldi
        memur1.saatUcreti=10;
        memur1.maas= memur1.maasHesapla();
        memur1.statu="Memur";
        System.out.println(memur1);

        Memur memur2 = new Memur();
        //Personel Class'indan aldi
        memur2.persNo=1002;
        memur2.isim="Ayhan";
        // memur2.soyisim="Tepe";
        // memur2.adres="Ankara";
        // memur2.tel="3125756595";

        // Muhasebe Class'indan aldi
        memur2.saatUcreti=20;
        memur2.maas= memur2.maasHesapla();
        // memur2.statu="Memur";
        System.out.println(memur2);


         }

    @Override
    public String toString() {
        return "Memur{" +
                "saatUcreti=" + saatUcreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
