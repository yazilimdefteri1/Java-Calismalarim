package day15_methodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        String str= "Java ogrenmek cok zevkli";

        //str'in ilk 4 harfini almak istesek
        str.substring(0,4);
        // bir program yaparken kodlarimizin daha kısa ve anlaşilir olmasi icin
        // sürekli kullanabilecegimiz kod bloklarini hazır olarak bir yere koyar
        // ihtiyacimiz oldukca oradan alip kullaniriz

        // method'lar robotlara benzer
        // method olusturmak bazen o method'un yapacagi isi yapmaktan zor olabilir.
        // bir islemi sadece bir kere yapacaksak method kullanmamiza gerek olmayabilir.
        // ancak özellikle cok kullanacagimiz islemler icin
        // her seferinde yeniden ayni kodlari yazmak yerine
        // bu islemi yapan hazir bir method olusturmak cok daha pratiktir

        // bazen bir class'in icerisinde cok uzun kodlar ayzarsak
        // tum class'in anlasilmasi zzorlasabilir
        // bunun yerine kod'un belli kisimlarini ayri methodlar olusturup
        // main method icerisinden istedigimiz sekilde bu methodlari yonetebiliriz

    }
}
