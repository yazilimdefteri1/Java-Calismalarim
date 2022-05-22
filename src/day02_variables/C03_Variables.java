package day02_variables;

public class C03_Variables {
    public static void main(String[] args) {

        String ogrenciIsmi="Melih";

        ogrenciIsmi="Furkan";

        //bir variable declare edildikten sonra istedigimiz kadar deger degisimi yapabiliriz
        //Ancak declare edilen bir variable yeniden declare edilemez

        //String ogrenciIsmi="Abdullah";

        String isim,soyisim,dogumYeri;   //Ayni data turunde birden fazla variable tek komutla deklare edilebilir

        isim="Nihat";
        soyisim="ozel";
        dogumYeri="Ankara";

        int yas=20, maas=2500; //ayni data turunde birden fazla tek komutla deklare edilip deger atanabilir

        //Deklare ederken onemli olan data turlerinin hepsinin aynı olmasına dikkat etmeliyiz

        System.out.println(isim);
        System.out.println(soyisim);

        String tcNo="12345678901";
        String hiclik="";

        //  String non-primitive olduğu icin biz sadece data saklamak degil
        // ekstra bazi ozellikleri de kullanabiliyoruz
        // Eger tc no  , okul numarasi veya tel numarasi gibi
        // kendisi sayısal olan ancak  matematiksel bir islewmde kullanilmayan
        //  degerler icinde String kullanilabilir

        String harf="A";
        char harf2 = 'A';

        // bu ikisi icin de ayni durum gecerli
        //  ben a harfi icin bir variable 'i char olarak da olusturabilirim String olarak olusturabilirim
        //  Eger sadece saklayacaksak char kullanılabilir  ama
        //  String'in ozelliklerinden  istifade etmek icin  String olarak tanimlamak daha avantajli olabilir


    }
}
