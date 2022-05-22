package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {
        //siniftaki ogrenci listesini duzenli olarak yazdiralim

        Map<Integer, String> sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap);
        /*
        Eger key'lere tek tek ulasmka istersek
        index yapisina ihtiyacimiz var
        ancak map index yapisini detseklemez
        bunun icin key'leri once bir set'e
        sonra da set'in tum elementlerini bir List'e ekledik.
         */

        Set<Integer> sinifKeySet = sinifListMap.keySet();
        List<Integer> keyList = new ArrayList<>();
        keyList.addAll(sinifKeySet);
        //System.out.println(keyList.get(8));

        // simdi de value'leri index ile ulasabilecegimiz bir sekle sokalım'

        Collection<String> sinifValueColl = sinifListMap.values();
        System.out.println(sinifValueColl);

        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueColl);
        System.out.println(sinifValueList);

        /*
        her bir value birden fazla bilgiyi iceriyor
        onun icin value'lari multidimensional vir array'e atmak mantıklı duruyor
        ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var.
         */

        int outerArrayBoyut = sinifValueList.size();

        //inner array'lerin boyutunu bulmak biraz daha kompleks olacak

        String ilkValue = sinifValueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[] = ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;

        String valueMDArr[][] = new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String temp[] = sinifValueList.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                valueMDArr[i][j] = temp[j];

            }
        }
       // bu satira kadar keyleri index ile ulasabildigim keyList'e atadim.
        // value'leri valueMDArr'ye atadim
        // simdi yazdiralim

        System.out.println("  Numara     Isim      Soyisim     Brans");
        System.out.println("============================================");
        for (int i = 0; i < keyList.size() ; i++) {
            System.out.printf("%6d",keyList.get(i));
            for (int j = 0; j <valueMDArr.length ; j++) {
                System.out.printf("%11s",valueMDArr[i][j]);
            }
            System.out.println("");
            }
        }
    }

