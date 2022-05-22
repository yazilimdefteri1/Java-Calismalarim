package day21_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        String arr1[]={"Ali","Veli","Ayse"};
        // array icindeki elemetlere ulasabilmek icin index kullanilir

        System.out.println(arr1[0]);
        arr1[1]="Esila";
        System.out.println(arr1[1]);

        // arrayin icindeki indexi kullanarak elemetlere ulasabilir ve update edebiliriz

        int arr2[]=new int[4];

        System.out.println(arr2[1]);
        System.out.println(arr2[3]);
        // Arrayin tamamini yazdirmak istersek
        System.out.println(arr2); // bu komutla referans numarasini yazar
                                    // arraylar non primitive olduklarinden dirk yazdirmak istersek
                                     // java referans bilgisini yazdirir

        System.out.println("");
        // arrayi yazdirmak icin javadaki Array class'indan toStrng() kullanilir
        System.out.println(Arrays.toString(arr2)); // [0, 0, 0, 0]
        // System.out.println(arr2[5]); // out of bounds hatasi veriir
        System.out.println("");
        arr2[1]=11;
        arr2[3]=9;
        System.out.println(Arrays.toString(arr2)); // [0, 11, 0, 9]
        System.out.println(Arrays.toString(arr1)); // [0, 11, 0, 9]


    }
}
