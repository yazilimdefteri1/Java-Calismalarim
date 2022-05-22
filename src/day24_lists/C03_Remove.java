package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {


        ArrayList<Integer> list1=new ArrayList<Integer>(); //1.yazım yöntemi
        ArrayList<Integer> list2=new ArrayList<>(); //2.yazım yöntemi
        List<String> list3=new ArrayList<>(); //3.yazım yöntemi genelde bunu kullanacagiz

        list1.add(5);  // tek tek ekleme yapılabiliyor
        list1.add(3);
        list1.add(25);
        list1.add(51);
        list1.add(73);
        list1.add(1,1); // 1. indexe 1 elementini ekler


        list1.remove(2);  //  listeden belirtilen index teki elemani siler

        System.out.println(list1);

        int sayi=2;
        Integer sayi1=51;
        list1.remove(sayi1);
        System.out.println(list1);
    }
}
