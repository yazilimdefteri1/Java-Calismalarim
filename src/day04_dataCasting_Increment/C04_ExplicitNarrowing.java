package day04_dataCasting_Increment;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2; //87.9
        System.out.println(sayi3);

        int sayi4= (sayi1/(int)sayi2);


                            // deger double, variable integer
                            //yani variable daha dar dolayisiyla  bunu otomatik olarak yapmaz
                            // sorumlulugu ustlenmemizi ister.
                            // sag taraf yazdigimiz (int)  sorumluluk bende demek

        System.out.println(sayi4); //87

        int sayi5=140;
        byte sayi6= (byte) sayi5;  // sag taraftaki deger int > soltaraftaki variable byte

        System.out.println(sayi6);

        sayi5=588;
        sayi6= (byte) sayi5;  // sag taraftaki deger int > soltaraftaki variable byte
        System.out.println(sayi6);

        sayi5=260;
        sayi6= (byte) sayi5;  // sag taraftaki deger int > soltaraftaki variable byte
        System.out.println(sayi6);

        sayi5=-130;
        sayi6= (byte) sayi5;  // sag taraftaki deger int > soltaraftaki variable byte
        System.out.println(sayi6);

    }
}
