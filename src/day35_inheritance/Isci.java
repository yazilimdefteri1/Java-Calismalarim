package day35_inheritance;

public class Isci extends Personel{
    public static void main(String[] args) {

        Personel objPers= new Personel();
        objPers.isim="Eren";
        objPers.soyisim="Terzioglu";
        objPers.adres="Amsterdam";

        Isci objjIsci=new Isci(); // İsci Class'indan obje olusturup
                                    // parebt'takei variable'lara deger atadik.
        objjIsci.isim="Huseyin";
        objjIsci.soyisim="Efe";
        objjIsci.adres="Ankara";

    }
}
