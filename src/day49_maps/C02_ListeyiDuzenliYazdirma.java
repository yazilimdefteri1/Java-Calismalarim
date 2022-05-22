package day49_maps;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDuzenliYazdirma {

    public static void main(String[] args) {
        // Sinif listesini duzenli sekilde yazdirmak

        Map<Integer,String> sinif=MapOlustur.myMap();
        System.out.println(sinif);
        sinifListYazdir(sinif);
    }

    public static void sinifListYazdir(Map<Integer, String> sinif) {



        // Map yapisinda yazdirdigimizda kullanicilar birsey anlamayabilir
        // bunun icin map yapisini kodlarla manipule edip
        // map'deki daytalari, istedigimiz formata sokmamiz gerekir
        // 1. Adim key ve value'lari map'dan alip
        // iki farkli collection uyesine atadik


        System.out.printf("%-9s %-10s %-10s %-10s\n", "Numara", " Isim", " Soyisim", " Brans");
        System.out.println("==========================================");
        Set<Integer> keySets = sinif.keySet();
        Collection<String> valueSet = sinif.values();

        for (Integer each:keySets) {
            String values = sinif.get(each);
            String[] valuesArray = values.split(",");
            int index = 0;
            while (index < valuesArray.length-1)
                System.out.printf("%-10d %-10s %-10s %-10s\n", each , valuesArray[index], valuesArray[++index], valuesArray[++index]);
        }
    }

        }





