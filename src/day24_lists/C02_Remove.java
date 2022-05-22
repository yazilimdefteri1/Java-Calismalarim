package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<String>();
        isimler.add("Aykut");
        isimler.add("Hasan");
        isimler.add("Onur");
        isimler.add("Veli");
        isimler.add("Ayşe");
        isimler.add("Oguzhan");

        System.out.println(isimler);

        boolean sonuc=isimler.remove("Onur");

        if (sonuc==true){
            System.out.println("İstediginiz isim silindi");
        } else {
            System.out.println("İstediginiz isim listede olmadigindan silinemedi");
        }
        /* System.out.println(isimler.remove("Onur"));  //eger islemi gerceklestirise true döndürür
        System.out.println(isimler.remove("Ali"));   // gerceklestiremezse false döner
        System.out.println(isimler); */



        // remove(index) yazdigimizda sildim/silmedim ihtimali kalmaz
        // bize remove edilen elementi doner
        String  sonuc1=isimler.remove(4);
        System.out.println(sonuc1);
        System.out.println(isimler);
    }
}
