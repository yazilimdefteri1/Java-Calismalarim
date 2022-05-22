package day25_lists;

import java.util.Arrays;
import java.util.List;

public class C06_ArraydanListOlusturma {
    public static void main(String[] args) {
        //verilen bir array'i listeye cevirin

        String [] arr ={"A", "B", "C"};
        List<String> arraydanList=Arrays.asList(arr);

        //arrayden liste cevirdigimiz zaman yeni listin uzunlugunu degistiremeyiz
        //dolayiisyla yeni list ile add(), remove(), clear() giibi methodlar calistirmak
        // istedigimizde exception olusur

        // arraydanList.add("J"); UnsupportedOperationException

        System.out.println("19.satirda list : " + arraydanList);

        arr[1]="F";

        System.out.println("23.satirda Array : " + Arrays.toString(arr));
        System.out.println("24.satirda list : " + arraydanList);

        arraydanList.set(0,"Y");

        System.out.println("28.satirda Array : " + Arrays.toString(arr));
        System.out.println("29.satirda list : " + arraydanList);
    }
}
