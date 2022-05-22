package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        // List 'ten gelen ozellikleri biliyoruz
        // onun icin Deque 'den gelen ozelliklere bakalim

        Deque<Integer> ll1 =new LinkedList<>();

        ll1.addFirst(10); // basa element ekler
        ll1.addLast(20); // sona element ekler, add Method'una gore daha hizlidir.
        System.out.println(ll1);
        System.out.println(ll1.element()); // Liste basindaki ilk elementi getirir. Bulamazsa exception firlatir.
        System.out.println(ll1.getLast());
        System.out.println(ll1.getFirst());

        ll1.offer(30);
        System.out.println(ll1);
        ll1.offerLast(40);
        ll1.offerFirst(50);
        System.out.println(ll1);

        System.out.println(ll1.peek()); //ilk eleman yoksa null doner

    }
}
