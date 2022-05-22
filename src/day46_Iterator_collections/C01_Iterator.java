package day46_Iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C01_Iterator {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(5);
        liste.add(7);
        liste.add(8);
        liste.add(6);
        liste.add(9);
        System.out.println(liste); // [5, 7, 8, 6, 9]

        Iterator itr= liste.iterator(); // iterator method'unu olusturdugumuz liste objesi
                                        // uzerinden ArrayList'in class'indan calistiriyoruz.

       /*
       İterator nasil calisir.
       Bir iterator objesi olusturmak icin collection uyesi bir obje kullanmaliyiz.
       yani biz bu iterator objesini bizim ornegimizde liste objesi uzerinde
       calismak icin olusturmus olduk.
       Biz iterrator objesini olusturdugumuzda iterator collection'in ilk elementinin oncesine gidip bekler
       [(itr)5, 7, 8, 6, 9]

       itr.hasNext()==> true  iterator'a yaninda eleman var mi diye sorar, true veya false dondurur.

       itr.next();==> iterator bir sonraki elementin yanina gecer,
                      ve uzerinden gectigi elemeni bize dondurur.
                       [5, (itr)7, 8, 6, 9]==> bize 5 dondurur
        Tekrar;
       itr.next();==> yazarsak

       [5, 7, (itr)8, 6, 9]==> bize 7 dondurur

       itr.remove();//==> iteraror'in elinde olan elementi sildi
                          [5, 8, 6, 9] uzerinden atladigi en son 7 elemanini siler

                          dolayisiyla ust uste 2 kere itr.remove(); KULLANİLAMAZ

        once itr.next methodunu calistirip
        iterator'un bir elemnt almasini saglamaliyiz.

        */

        System.out.println(itr.hasNext()); // true
        System.out.println(itr.next()); // 5
        System.out.println(itr.next()); // 7

        itr.remove();//==> [5, 8, 6, 9] uzerinden atladigi en son 7 elemanini siler
        System.out.println(liste);

    }
}
