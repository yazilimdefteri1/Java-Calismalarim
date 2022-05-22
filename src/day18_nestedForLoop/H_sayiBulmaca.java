package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde ""sayiyi buyult" veya " sayiyi kucult" diye yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Random r = new Random(); //random sınıfı
        // Random sınıfı, rastgele sayılar üretmek için kullanılır.
        // Java’da bu işlemi Random sınıfı ile yapabiliriz.
        // Random sınıfı, sadece int türünde değil float, btye, double gibi türlerde de sayı üretebilir.
        //   Bu sınıfı da Scanner sınıfı gibi import ediyoruz

        int a = r.nextInt(100);  // Tuttugu degeri bir integer variable'a atıyoruz.
        // Parantez içindeki sayi dahil degildir.
        // Parantez içerisini bos birakirsak  variable alt ve üstlimiti arasinda bir deger tutar(-2147483648 ve +2147486647 arasında)

        Scanner scanner = new Scanner(System.in);

        int sayi = 0; // While döngüsü için girecegimiz sayiyi önden int olarak tanimlayip 0 dgerini atiyruz
        int i = 0; // tahmin sayisi sayaci icin degişken tanimlayip 0 degerini atiyoruz

        System.out.println("*********Bilgisayarin Tutmus Oldugu*********");
        System.out.println("************Sayiyi Bulma Oyununa************");
        System.out.println(" ***************Hosgeldiniz****************");

        while (!(sayi == a)) { // while döngüsü baslangici
            i++;  //tahmin sayacı
            System.out.print("Lutfen tahmininizi giriniz : ");
            sayi = scanner.nextInt();
            if (sayi < a) {  //  25   bilgisayar 30
                System.out.println("Lutfen sayiyi buyultunuz");
            } else if (sayi > a) { //  25   bilgisayar 20
                System.out.println("Lutfen sayiyi kucultunuz");
            } else {
                System.out.println(":-) Bravo " +i + ". tahminde dogru tahmin ettiniz :-) ");
            }
        } // while döngüsü bitisi
    }
}
