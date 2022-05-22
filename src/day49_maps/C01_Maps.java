package day49_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {

        /*
        Java'da collecion uyesi bir yapida
        data turu Object secilirse, her data turunden deger ekleyebiliriz.
        Ancak bu durumda surekli casting problemleri ile karsilasabiliriz
         */

    List<Object> list=new ArrayList<>();
    list.add("Ergin");
    list.add(15);
    list.add(10.2);

        System.out.println(list);
        list.set(1,(Integer)(list.get(1))+10);

        Map<Integer,String> siniflist=new HashMap<>();
        // bir sisnifta ogrenci no ve isim, soyisim, brans olarak map olusturmak istiyoruz.
        // key tek bir unique degerdir,
        // ama value/deger birden fazla bilginin birlesmesinden olusabilir
        // bu durumda daha sonra istedigimiz bilgilere dogru sekilde ulasabilmek icin
        // tum elemntler icin value ayni bicimde olusturulmalidir.
        // (veri siralmasi ve sekilsel acidan format ta ayni olmalidir.

        siniflist.put(101,"Ali, Can, Dev");
        siniflist.put(102,"Veli, Yan, QA");
        siniflist.put(103,"Ali, Yan, Dev");
        System.out.println(siniflist); // {101=Ali, Can, Dev, 102=Veli, Yan, QA, 103=Ali, Yan, Dev}
        System.out.println(siniflist.keySet()); // [101, 102, 103]
        System.out.println(siniflist.values()); //  [Ali, Can, Dev, Veli, Yan, QA, Ali, Yan, Dev]



    }

}
