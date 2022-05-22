package day21_arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        int arr[]; //deger atamasi yapmadik ama Java kabul etti
        // ancak kullnamamiza izin vermez

        arr = new int[6];
        System.out.println(Arrays.toString(arr)); // 6 tane sifir yazdiracak [0, 0, 0, 0, 0, 0]
        System.out.println(arr.length); //6
        // String' deki length(), bunda yok

        // array deki her bir elemani  index degeri kadar artiralim
        for (int i = 0; i < arr.length; i++) {
            arr[i] += i;
        }
        System.out.println(Arrays.toString(arr));
        // son index'teki elementi yazdiralim
        System.out.println(arr[arr.length - 1]);
    }
}
