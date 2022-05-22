package day45_interfaces;

public interface I01_Default_Static {
    /*
    Interface'lerde sadece abstract methodlar bulunur.
    Body'si olan cobcrete bir method olusturmak istedigimizde
    Java CTE verir.

    Ancak Java 8 ve üzeri versiyonlarda, istisnai olarak
    Static veya Default olarak tanimlanan methodlarin body'si olabilir.
    Ancak burada kullanilan default keyword'u access modifier degildir.
    cunku Interface'lerde tum method'lar public ve abstract'ti

    asagidaki ornekte gorulecegi gibi default olarak tanimlanmis
    bir method'a access modifier olarak public yazabilirsiniz.
    (access modifier yazmasak da Java method'u public olarak kabul edecektir.)
     */

    void method1();


    //void method2(){   }

    public default void method2(){ // basina default yazdigimiz icin method body oluturduk
        System.out.println("Interface'deki default method");
    }

    static void method3(){ // basina static yazdigimiz icin method body oluturduk
        System.out.println("Interface'deki static method");

    }
}
