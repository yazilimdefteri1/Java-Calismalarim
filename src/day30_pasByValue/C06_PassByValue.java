package day30_pasByValue;

import java.util.Arrays;

public class C06_PassByValue {
    public static void main(String[] args) {

        /* non primitive data turlerinde objenin kendisi degil de icindeki elemetler degisirse
        java on-bjenin referansi ve objenin KENDİSİ degismedigi icin
        element de degisikliklerini kabul eder ve sabit kalir
         */

        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDegistir(arr);
        System.out.println("method call sonrasi : " + Arrays.toString(arr));
    }

    private static void arrDegistir(int[] arr) {
        arr[0]=5;
        arr[1]=6;
        System.out.println(Arrays.toString(arr));
    }

}
