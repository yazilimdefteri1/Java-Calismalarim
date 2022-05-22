package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C04_Set {
    public static void main(String[] args) {
        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("İlker");
        isimler.add("Oguzhan");
        isimler.add("Hasan");
        isimler.add("Onur");

        System.out.println(isimler);

        isimler.set(4,"Ali");  //  verdigimiz indexteki degeri degistirme islemini yapar
                                //  fakat bu satiri yazdirsak eski degeri verir //Hasan
        System.out.println(isimler);

        // daha önceden listede var olanlari da arsiv gibi tutmak istersek

        List<String> logListesi= new ArrayList<>();
        logListesi.add(isimler.set(2,"Cosmos")); // bu satirda isimler listesindeki 2. indexi Cosmos yapti
                                                // 2. indexteki eski elementi(İlker) logListesine add yapti.

        System.out.println(isimler);
        System.out.println(logListesi);



    }
}
