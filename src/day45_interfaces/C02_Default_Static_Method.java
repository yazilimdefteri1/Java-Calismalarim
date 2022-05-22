package day45_interfaces;

public class C02_Default_Static_Method implements I01_Default_Static{

    /*
    Bir Interface'de default veya static olarak tanimlanan
     ve methodlarin override edilmesi MECBURİ DEGİLDİR
     */
    @Override
    public void method1() {
        System.out.println("Child Class method1");
    }

    public static void main(String[] args) {
        // Interface'de static olarak tanimlanan method'lara
        // static yontemlerle ulaşilabilir.
        I01_Default_Static.method3();

        C02_Default_Static_Method obj= new C02_Default_Static_Method();
        obj.method1();//Child class
        obj.method2();//Parent Interface
        // obj.method3(); //CTE verir. Eski class'larda static bir uyeye
        //static olmayan yollarlada ulasabilirdik
        //ancak Interface icerisnde static olarak tanımlanan method'a
        //static olmayan yontemlerle ulasilamaz.
    }
}
