package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {


        // Primitive data turu ile non-primitive arasındaki farklar nelerdir?

        String str= "Java";
        int sayi=10;
        System.out.println(str.toUpperCase()); // JAVA olarak yazdirdi
        System.out.println(str);

       // non-primitive data türleri data depolamak yaninda bircok faydalı method a sahiptir
        // Ancak primitive data turlerinin boyle bir ozelligi yoktur.
        // primitive data turleri sadece degerleri saklar (container)

        //primitive data turleri  icinde bazi methodlar gerekli oldugunda
        // Java ara bir cozum uretmistir
        //  Java her bir primitive data turunu non-primitive kullanabilmek icin
        // ozel class lar olusturmus ve bunlara Wrapper Class adini vermistir.

        double sayi2=20.5;

        //sayi2 primitice oldugundan sayi2. dedigimizde hicbir method gelmez

        Double sayi3=15.2;
        //sayi3  Wrapper Class olan Double (primitive den farkı bas harfi buyuk olarak yazariz)  Class'ini kullandigindan
        //  sayi3. dedigimizde bircok method gelir
    }
}
