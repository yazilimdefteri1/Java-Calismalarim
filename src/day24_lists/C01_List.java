package day24_lists;

import day23_multiDimensionalArrays.C06_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_List {
    public static void main(String[] args) {
        int arr[]={};

        //bu array'e 5 ekleyelim

        C06_Arrays obj=new C06_Arrays();

        arr= obj.arrayeElemanEkle(arr,5);

        System.out.println(Arrays.toString(arr));

        //bir de 3 ekleyelim

        arr= obj.arrayeElemanEkle(arr,3);
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> list1=new ArrayList<Integer>(); //1.yazım yöntemi
        ArrayList<Integer> list2=new ArrayList<>(); //2.yazım yöntemi
        List<String> list3=new ArrayList<>(); //3.yazım yöntemi genelde bunu kullanacagiz

        list1.add(5);  // tek tek ekleme yapılabiliyor
        list1.add(3);
        list1.add(25);
        list1.add(51);

        System.out.println(list1);
        list1.add(2,89); // araya da element ekleme yapılabiliyor 2. indexe 89 elemntini ekliyor
        System.out.println(list1);
        System.out.println(list1.size()); //  listede kaç eleman oldugunu gösterir
        list1.remove(2);  //  listeden belirtilen index teki elemani siler
        System.out.println(list1);

        list3.add("kedi");
        list3.add("kuş");
        list3.add(2,"köpek");
        System.out.println(list3);


    }
}
