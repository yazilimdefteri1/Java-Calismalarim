package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class C08_ListedeElemanlarinYeriniDegistirme {
    public static void main(String[] args) {

        // Verilen bir listee, istenen iki index'deki elementlerin yerini
        // kalici olarak degistiren bir method olusturun

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(0);
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(7);

        int ilkIndex = 6;
        int ikinciIndex = 3;

        sayilar = swapsElement(sayilar, ilkIndex, ikinciIndex);
        System.out.println(sayilar);
    }

    public static List<Integer> swapsElement(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        // bir temp sayi olusturp
        // verilen indexlerdeki sayilari yer degistirin
        // indexleri kontrol edip sinirin otesinde index verildiyse uyarı mesajı yazdirin

        if (sayilar.size() > ikinciIndex && sayilar.size() > ilkIndex) {
            int temp = 0;

            temp = sayilar.get(ilkIndex);

            sayilar.set(ilkIndex, sayilar.get(ikinciIndex));
            sayilar.set(ikinciIndex, temp);

        } else {
            System.out.println("Degistirlmesini istediginiz index " +
                    "list index sinirini gectiginiz için " +
                    "liste degistirilemedi");
        }
        return sayilar;
    }
}
