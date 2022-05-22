package day30_pasByValue;

public class C03_passByValue {
    public static void main(String[] args) {

        /* Java Pass By Value bir programlama dilidir.
        Yani; bir primitive variable2i argumrent olarak
         */
        double etiketFiyatı=100;
        yuzdeOnIndirimYap(etiketFiyatı);
        yuzdeOnIndirimYap(etiketFiyatı);

        System.out.println("iki indirimden sonra main method'da etiket fiyati : "+ etiketFiyatı);

    }

    private static void yuzdeOnIndirimYap(double etiketFiyatı) {

        etiketFiyatı=etiketFiyatı*0.90;
        System.out.println("Sizin icin %10 indirimli fiyatimiz : " +etiketFiyatı);
    }
}
