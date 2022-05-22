package day23_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {


        // kullaniciya kac elementlik bir array olusturacagini sorun
// array'i olusturup elementleri kullanicidan alip, array'e atayin

     Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kac elemetli bir array istediginiziz yazin : " );

        int uzunluk=scan.nextInt();

        int arr[]=new int[uzunluk];

        for (int i = 0; i < uzunluk; i++) {

            System.out.println("array icin " + (i+1)+ ". elementi giriniz : ");
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));

    }
}
