package day36_inheritance;

public class UstaBasi extends Isci{

    public static void main(String[] args) {
        UstaBasi ustabasi1=new UstaBasi();
        ustabasi1.saatUcreti=15;
        ustabasi1.isim="Murat";
        ustabasi1.soyisim="Gokcek";
        ustabasi1.statu="Isci";
        ustabasi1.isciSatatu="Ustabasi";
        ustabasi1.maas= ustabasi1.maasHesapla();
        System.out.println(ustabasi1);
    }

    @Override
    public String toString() {
        return "UstaBasi{" +
                "isciSatatu='" + isciSatatu + '\'' +
                ", saatUcreti=" + saatUcreti +
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
