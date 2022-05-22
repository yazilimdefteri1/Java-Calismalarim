package day47_linkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {
        Deque<Integer> ll1 = new LinkedList<>();

        System.out.println(ll1.peek()); // bosken kullanırsak null donduurur
       // System.out.println(ll1.element()); // bosken kullanırsak exception firlatir

        System.out.println(ll1.poll()); // bosken kullanirsak null dondurur.
        System.out.println(ll1.pollFirst());
        System.out.println(ll1.pollLast());

      //  ll1.pop();  //ilk elementi silip bize dondurur.
                    // ilk elementi bulamazsa exception firlatir.
        ll1.push(10);
        ll1.push(20);
        System.out.println(ll1.remove());
        ll1.push(11);
        ll1.push(12);
        ll1.push(30);
        ll1.push(40);
        ll1.push(50);
        ll1.push(40);
        System.out.println(ll1);
       ll1.remove(10); //object olarak 10'u siler List methodundan farki index değil object siler
        System.out.println(ll1);
        ll1.removeFirstOccurrence(40);
        System.out.println(ll1);
        ll1.poll(); // ilk elemneti siler
        System.out.println(ll1);


    }
}
