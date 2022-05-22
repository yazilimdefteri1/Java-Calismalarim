package day46_Iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02_ListeninElementleriniArtirma {
    public static void main(String[] args) {
        //verilen listedeki her elementi 3 artirin.

        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste); // [5, 7, 8, 6, 9]

        /* listenin tum elemntlerini bize getirmesi icin
        iterator'un hasNext ve next methodlarini berbaer kullanacagiz
         */

        ListIterator itr= liste.listIterator();

        while(itr.hasNext()){ // yaninda element oldugu müddetce calisacak


           Object sayi= itr.next();
           itr.set((Integer)sayi+3);

        }
        System.out.println(liste);
    }
}
