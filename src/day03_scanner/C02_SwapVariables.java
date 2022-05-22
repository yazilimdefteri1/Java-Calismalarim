package day03_scanner;

public class C02_SwapVariables {

    public static void main(String[] args) {

//1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
// Orn  : sayi1=10 ve sayi2=20;
//  kod calistiktan sonra
//  sayi1=20 ve sayi2=10


        int sayi1=10;
        int sayi2=20;

        System.out.println("Swaptan önce sayi1 : " + sayi1 + ", sayi2 : " + sayi2);

        //1.adim bos bir variable olusturup
        //sayi1 'i ona atayalim

       int sayi3=sayi1;

       //2.adim sayi1 'e yeni degerini atayalim
       sayi1=sayi2;

       // sayi2'yer sayi3 'e yedeklediğimiz yeni degerini atayalım
       sayi2=sayi3;

        System.out.println("Swaptan sonra sayi1 : " + sayi1 + ", sayi2 : " + sayi2);




    }
}
