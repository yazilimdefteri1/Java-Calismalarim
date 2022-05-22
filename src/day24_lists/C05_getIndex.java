package day24_lists;

import java.util.ArrayList;
import java.util.List;

public class C05_getIndex {
    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<Integer>(); //1.yazım yöntemi

        list1.add(5);  // tek tek ekleme yapılabiliyor
        list1.add(3);
        list1.add(25);
        list1.add(51);

        System.out.println(list1.get(2)); // 25  degeri gelir.  2. indexteki hangi degeri görmemizi saglar.
    }

}
