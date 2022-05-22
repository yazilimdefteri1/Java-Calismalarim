package day16_MethodCreation;

public class C03_Overloading {
    public static void main(String[] args) {

        // verilen iki sayiyi toplayan yazdiran bir method olusturalim
        int sayi1 = 10;
        int sayi2 = 20;
        ikiSayiToplam(sayi1, sayi2);

        //iki double sayinin toplamini uazdiran bşir method olusturalim
        double sayi3 = 15;
        double sayi4 = 10.2;
        ikiSayiToplam(sayi3, sayi4);

        // eger variable olusturmadan direk sayilari yaxarak method call yaparsak
        ikiSayiToplam(15, 25);//int toplam verir
        ikiSayiToplam(15.3, 25.6);//double toplam verir

        //bir integer ile bir double tolamini yazdiran  bir method olusturalim
        int sayi5 = 13;
        double sayi6 = 22.4;
        ikiSayiToplam(sayi5, sayi6); //double toplam verir

           }
    private static void ikiSayiToplam(int sayi5, double sayi6) {
        System.out.println("bir integer bir double sayi toplami : " + (sayi5 + sayi6));
    }

    private static void ikiSayiToplam(double sayi3, double sayi4) {
        System.out.println("iki double sayi toplami : " + (sayi3 + sayi4));
    }

    private static void ikiSayiToplam(int sayi1, int sayi2) {
        System.out.println("iki integer toplami : " + (sayi1 + sayi2));
    }
}
