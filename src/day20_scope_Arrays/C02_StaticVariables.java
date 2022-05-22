package day20_scope_Arrays;

public class C02_StaticVariables {

    static String okulIsmi="Yildiz Koleji";
    static int okulNo;
    static boolean okulAcikMi;

    public static void main(String[] args) {

        // instance variable'lar objeye bagimlidirlar
        // ve her obje farkli deger alabilir
        // buna ornek olarak ogrenci notlari veya ogretmen branslari diyebiliriz
        // bir objeye ait bir variabl'nin son degerini bulmak icin sadece o objeyi dikkate aliriz

        // static variable'lar ise class variable olarak tanimlanir
        // ve tum class uyeleri icin aynidir
        // Okul ismii okul mudurunun adi gibi
        // eger static variable'nin degeri degistirilirse herkes icin degisir

        System.out.println(okulIsmi); //Yildiz Koleji
                                    // static vatriable'lara Static Main den ulasabiliriz

        System.out.println(okulNo); //0
        okulNo=102;
        System.out.println(okulNo); //102
        System.out.println(okulAcikMi); // false

        System.out.println(okulNo);
        staticMethod(); // Asagida olusturdugumuz method'u cagirip calistiriyoruz
        System.out.println(okulNo);
    }
    public static void staticMethod(){

        okulNo=200;
        System.out.println(okulNo); //200
    }
}
