package day23_multiDimensionalArrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {

        // verilen bir array'a yeni bir element ekleyen bir method olusturun

        int arr[]={3,5,7};
       // arr[3]=8;  //uzunlugu önceden belirlendigi icin array e ekleme yapamayiz
       // arr[={1, 3, 8;  //var olan bir array' e ayni boyutta bile olsa direk yeni degerler iceren bir deger atayamayiz


        arr =new int[4]; // [0, 0, 0, ]

        int arrYeni[]= new int[5];
        System.out.println(Arrays.toString(arr));

        arrYeni[0]=2;
        arrYeni[3]=5;

        arr=arrYeni;
        System.out.println(Arrays.toString(arr));

        // Bir array'e icinde hazir elementlerin oldugu yeni bir array atamak isterseniz
        // bunu {1,2,3} seklinde yazarak degil
        // new int[3] diyerek olusturup sonra deger atayarak tamamladigimiz bir array'i
        // assign ederek yapabiliriz

        int arrEnYeni[]={1,2,3,4,5};
        arr=arrEnYeni;

    }
}
