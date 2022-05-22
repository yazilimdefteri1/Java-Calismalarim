package day30_pasByValue;

public class C04_passByValue {
    // eger bir method da yapilan degisikligin kalici olmasini istiyorsak
    // iki yontem kullanabiliriz
    // 1- variab'i class level'de static olarak olusturabilirim
    static int etiketFiyati;
    static int indirimYuzdesi;

    public static void main(String[] args) {
        etiketFiyati=100;
        indirimYuzdesi=10;
        kaliciIndirimYap();
        indirimYuzdesi=15;
        kaliciIndirimYap();
        indirimYuzdesi=5;
        kaliciIndirimYap();
    }

    public static void kaliciIndirimYap(){
        etiketFiyati=etiketFiyati*(100-indirimYuzdesi)/100;
        System.out.println("indirimli fiyat : " + etiketFiyati);

    }
}
