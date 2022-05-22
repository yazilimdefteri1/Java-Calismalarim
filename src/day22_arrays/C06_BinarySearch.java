package day22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static <type> void main(String[] args) {
        //verilen array'de istenen bir elementin var olup olmadigini true/false yazdirin


        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        int arr2[] = {3, 4, 6, 1, 9, 45, 25, 5, 9, 0};
        int istenenSayi = 4;

        // Eger Javadan hazir BinarySearch ile yapmak isterseniz
        // once sort methodunu kullanip, sonra binarySearch yapmaliyiz
        // BinarySearch Methodu bize istenen sayinin oldugu index'i verir

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println(Arrays.binarySearch(arr, istenenSayi)); // bize istedigimiz elementin index'ini döner

        // eger olmayan bir elementi aratirsak
        // Java bulamadigini gosternek icin - işareti koyar
        // sonrada o sayi olsaydi siralamasi ne olacak ise o sirayi verir.



    }
}
