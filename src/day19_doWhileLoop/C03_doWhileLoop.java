package day19_doWhileLoop;

public class C03_doWhileLoop {
    public static void main(String[] args) {
        //kullanicidan pozitif bir tamsayi alip
        // while Loop ile sayidan kucuk pozitif sayilari yazdiralim
        int input = 3;
        int sayi1 = 1;
        int sayi2 = 1;

        while (sayi1 < input) { // While loop önce kontrol yapip sonra islem yapmaktadir
            System.out.println(sayi1);
            sayi1++;
        }

        // ayni soruyu do while loop ile yapalim
        do {
            System.out.println(sayi2);
            sayi2++;
        } while (sayi2 < input);

    }

}
