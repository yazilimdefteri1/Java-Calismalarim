package day22_arrays;

import java.util.Arrays;

public class C10_ArraysEquals {
    public static void main(String[] args) {

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int arr2[] = {3, 4, 6, 1, 9, 45, 25, 5, 9, 0};

        System.out.println(Arrays.equals(arr,arr2)); //  equals hem eşitlikte hem index e hemde degere bakmaktadir
        // ikisi de aynı degilse false olur
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr,arr2));  // ikisi de aynı ise true olur
    }
}
