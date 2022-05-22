package day25_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();

        harfler.add("D"); // [D]
        harfler.add("M"); // [D,M]
        harfler.add(1,"T"); // [D, T, M]
        harfler.add(0,"T"); // [T, D, T, M]
        System.out.println(harfler);

        System.out.println(harfler.contains("T")); // true
        System.out.println(harfler.contains("F")); // false

        List<String> karakterler= new ArrayList<>();
        karakterler.add("M"); // [D]
        karakterler.add("T"); // [D]

        System.out.println(harfler.containsAll(karakterler)); // True döner
        karakterler.add("F");
        System.out.println(harfler.containsAll(karakterler)); // bir element dahi olmasa false döner

        Collections.sort(harfler);
        System.out.println(harfler);

    }
}
