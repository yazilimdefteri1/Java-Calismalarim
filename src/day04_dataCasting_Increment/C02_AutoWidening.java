package day04_dataCasting_Increment;

public class C02_AutoWidening {
    public static void main(String[] args) {

           boolean dogruMu=true;

         //  String str=dogruMu;   // sol String  sag boolean olunca kabul etmiyor
        // String str="dogruMu";   cift tirnak icinde hata vermez
        byte sayi1=44;
        System.out.println(sayi1); //44

        short sayi2=sayi1;  // esitligin solu short, sagi  ise byte olmasina ragmen itiraz etmiyor.
        // deger olarak atanan data turu variable data turunden kucuk oldugu icin sorun yapmaz
        //  buna Auto Widening  denir

        System.out.println(sayi2); //44


       // short sayi3=256;
       // System.out.println(sayi3);
       // byte sayi4=sayi3;  // tam tersinde hata veriyor  buyugu kucuge atayamıyoruz
    }

}
