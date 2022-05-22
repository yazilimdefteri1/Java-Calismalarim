package day15_methodCreation;

public class C09_MethodCreation {
    public static void main(String[] args) {

        String isim="Oguzhan Ahmet";
        String soyIsim="Balkaya";
        String kkNo= "1234567890123456";

        // Eger bir methoddan bir islem yapmasini ve
        // yaptigi islemi bize getirmesini isterseniz
        // return type void degil, bize getirecegi sonucun data turunde olmailidir
        String gizlenmisIsimSoyisim=isimSoyisimGizle(isim,soyIsim);
        // bana isim ve soyismin gizlenmis halini getirmesini istiyorum
        // bekledigim donus string olur

        System.out.println(gizlenmisIsimSoyisim);
        String gizlenmisKKNO= krediKartiGizle(kkNo);
        System.out.println(gizlenmisKKNO);

    }

    public static String krediKartiGizle(String kkNo) {
        String yeniKKNo="**** **** *** "+ kkNo.substring(12);
        return yeniKKNo;
    }

    public static String isimSoyisimGizle(String isim, String soyIsim) {
        String yeniIsim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoyIsim=soyIsim.substring(0,1).toUpperCase()+
                soyIsim.substring(1).replaceAll("\\S","*");

        // Method olusturma da 3. adim
        // method calisinca sadece birsey mi yazdiracak
        // yoksa bize bir data mi dondurecek buna karar vermektir
        // bu soruda gizlenmis isim soyisim dondurmesi istendiginden
        // return type' i void degil String sectik
        // ve method'un sonuna return edilecek datayi yazdik
                return yeniIsim+" "+yeniSoyIsim;

    }
}
