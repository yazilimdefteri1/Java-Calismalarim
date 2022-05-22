package day25_lists;

import java.util.ArrayList;
import java.util.List;

public class K01_Odev {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(11);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(35);
        sayilar.add(1);
        sayilar.add(7);

        int ilkIndex=2;
        int ikinciIndex=5;

        if (ilkIndex>sayilar.size() ||ikinciIndex>sayilar.size() ){
            System.out.println("Degidtirlmesini istediginiz index list index uzunlugundan büyük");
        }
        int temp=0;
        int temp1=0;
        temp= sayilar.get(ilkIndex);
        temp1= sayilar.get(ikinciIndex);

        System.out.println(sayilar);
        sayilar.set(ilkIndex,temp1);
        sayilar.set(ikinciIndex,temp);
        System.out.println(sayilar);

    }
}
