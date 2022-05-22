package day03_scanner;
import java.util.Scanner;
public class C033_SwapKendimCalisma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1.Sayiyi Giriniz : ");
        int deger1 = scan.nextInt();
        System.out.println("2.Sayiyi Giriniz : ");
        int deger2 = scan.nextInt();
        int takas = 0;

        System.out.println("Takastan Once");
        System.out.println("Deger 1 = "+ deger1);
        System.out.println("Deger 2 = "+ deger2);

        takas = deger1;
        deger1 = deger2;
        deger2 = takas;
        System.out.println("Takastan Sonra");
        System.out.println("Deger 1 = "+ deger1);
        System.out.println("Deger 2 = "+ deger2);


    }
}
