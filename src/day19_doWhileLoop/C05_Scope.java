package day19_doWhileLoop;

public class C05_Scope {
    // 1-) Bir method içerisnde olusturulan variable'lar sadece olusturulduklari
    // method'da kullanilabilirler, baska method'larda kullanilamazlar
    //2-) Tum method'larin kullanabilmesini istedigimiz variable'lari
    // Class Level'da olustururuz

    // Class Level'da olusturdugumuz variable'i
    // --Static yaparsak tum methodlar kullanabilir
    // --Static olmazsa(instance) o zaman sadece static olmayan methodlar kullanabilir.
    // 3-) Loop icinde olusturulan variable'lar
    // loop disinda kullanilamazlar

    static String kurs="Java";
    int level=10;


    public static void main(String[] args) {
        int sayi=10;
        //String isim="Veli yan";
        System.out.println(kurs);
        //System.out.println(level); static method da static plmayan bir variable'i kullanamyiz(ornek)
        for (int i = 0; i < 10; i++) {
            int loopSayi=20;

        }
        // asgidaki gibi loop icinde  olusturulan variable ler loop disinda kullanilamaz
        // System.out.println(i);
        //loopSayi=30;
    }
    public static void method1() {
        //sayi=20;
       String  isim="Ali Can";
        System.out.println(kurs);
        //System.out.println(level); static method da static plmayan bir variable'i kullanamyiz(ornek)
    }
    public void method2(){
        //sayi=30;
        //isim="Ayse San";
        System.out.println(kurs);
        System.out.println(level);// burada method static olmadigi icin bu variable burada kullanilabilmektedir.

    }
}
