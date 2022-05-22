package day39_overriding;

public class Corolla extends Toyota{

    protected String hiz=" Corolla max 200 hiz yaparlar";
    protected String yakit="Corolla benzinli veya elektriklidir.";
    protected String model="Corolla";


    public void motor(){
        System.out.println("Corolla arabalar cevreci motor kullanirlar");
    }

    public void yakitTuketimi(){
        System.out.println("Corolla 5.6 lt yakit tuketirler");
    }

    public void vitesSayisi(){
        System.out.println("Corolla 5 viteslidir");
    }

    public static void main(String[] args) {

        /*
        Data turu ve constructor farkli olduğunda
        Constructor calistigi icin obje
        Constructor'in oldugu class ozelliklerini tasir
        ancak Data turu Parent class secildigi iicn
        variable'lar data turunun secildigi class ve onun parent class'larindan deger alabilir.

        Methodlar icin ise yine data turunun oldugu class'a gideriz
        Ancak direk methodu calistirmadan once
        method Override edilmis mi diye konr-trol ederiz.
         */
        Corolla arb1= new Corolla();
        System.out.println(arb1.hareket); //araba
        System.out.println(arb1.hiz);  // Corolla
        System.out.println(arb1.yakit); // Corolla
        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.sirketMerkezi); // Toyota
        System.out.println(arb1.model); // Toyota
        arb1.motor();

        Toyota arb2= new Corolla();
        System.out.println(arb2.hareket); // Araba
        System.out.println(arb2.hiz);  // Toyota
        System.out.println(arb2.yakit); // araba
        System.out.println(arb2.marka); // Toyota
        System.out.println(arb2.sirketMerkezi); // Toyota
        // System.out.println(arb2.model); // CTE
        arb2.motor(); // Corolla
        arb2.garanti(); // Toyota
        arb2.yakitTuketimi(); // Corolla
        // arb2.vitesSayisi(); // CTE


        Araba arb3= new Corolla();
        System.out.println(arb3.hareket); // Araba
        System.out.println(arb3.hiz);  // Araba
        System.out.println(arb3.yakit); // Araba
        System.out.println(arb3.marka); // Araba
        // System.out.println(arb3.sirketMerkezi); // CTE
        // System.out.println(arb3.model); // CTE
        arb3.motor(); // Corolla
        // arb3.garanti(); // CTE verir
        arb3.yakitTuketimi(); // Corolla
        // arb3.vitesSayisi(); // CTE
    }
}
