package day19_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin,

        int input = 27;
        int bolen = 1;
        int sayac = 0;

        //for Loop ile de yapabiliriz. Biz while ile yapalim

        while (bolen <= input) {

            if (input % bolen == 0) {
                System.out.print(bolen + " ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(input + " sayisini bolen " + sayac + " sayi vardir");
    }
}
