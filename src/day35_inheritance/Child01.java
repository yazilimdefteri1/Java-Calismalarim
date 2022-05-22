package day35_inheritance;

public class Child01 extends Parent{
    public static void main(String[] args) {

        // Child Class hiçbir objeye ihtiyac duymadan
        // Parent Class'daki variable ve method'lara ulasabilir.

        System.out.println(isim); // Neval
        System.out.println(fabrika); // Yildi Tekstil
        method1();
        method2();
    }
}
