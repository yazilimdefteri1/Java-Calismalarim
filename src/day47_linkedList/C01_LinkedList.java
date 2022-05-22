package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*
        LinkedList'in 2 tane parent Interface'i vardir
        LinkedList olustururken data turu olarak;

        LinkedList secersek : iki parent'teki tum methodlar
        List secersek : sadece List Interface'ndeki method'lar
        Deque/Queue secersek : Deque'deki method'lari kullanabiliriz
         */

        LinkedList<Integer> ll1=new LinkedList<>();
        ll1.add(10); //LinkedList

        // sadece List interface'inden ozellikler kulllanmak icin

        List<Integer> ll2 = new LinkedList<>();
        ll2.add(10);
        ll2.remove(0);

        // Sadece Deque den gelen ozellikleri kullanalim
        Deque<Integer> ll3 = new LinkedList<>();
        ll3.addLast(20);
        ll3.addFirst(15);
        System.out.println(ll3); // [15, 20]
        ll3.addLast(40); // // [15, 20, 40]
    }

}
