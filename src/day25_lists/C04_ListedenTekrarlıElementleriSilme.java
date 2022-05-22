package day25_lists;



import java.util.ArrayList;
import java.util.List;

public class C04_ListedenTekrarlıElementleriSilme {
    public static void main(String[] args) {

        // verilen bir listede tekrar eden sayilari
        // sadece bir kere yazdiran bir method oluşturun
        // ornek:  [1, 3, 5, 3, 5, 6, 7, 1]
        // output:  [1, 3, 5, 6, 7]

        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

        System.out.println(sayilar);
        tekrarsizListeOlustur(sayilar);
    }

    public static void tekrarsizListeOlustur(List<Integer> sayilar) {

        List<Integer> tekrarsizListe=new ArrayList<>();

        for (int i = 0; i <sayilar.size() ; i++) {

            if(!tekrarsizListe.contains(sayilar.get(i))){
                tekrarsizListe.add(sayilar.get(i));
            }
        }
        System.out.println(tekrarsizListe);

    }
}
