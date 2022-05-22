package day21_arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        // array'in declare sekli asagidaki gibidir
        //data turu, array'in ismi ve koseli parantez yazarak array declare edilir

        int arr1[]={1,2,3,5,7,9};
        int arr4 []={1,5,7,9};
        int [] arr2={1,2,3,5};
        int[] arr3={1,2,5,9};

        double arr5[]={10.2,20.1,5};

        String arr6[]={"ali","veli","Ayse"};

        //assign etmek mecburimidir

        int sayi[];
        // kllanmadan once deger atamasi yapmamiz gerekir

        // hem deklare edip hem de atama yapacaksam nasil yapabilirim
        // 1- deklare edip esitligin sagina suslu pareantez icerisinde degerleri yazabilirim
        // 2- icine atamadan olusturmak isterseniz, boyutunu blirlememiz gerekir

        int arr7[]=new int[10]; //  java icinde 5 tane default deger olan bir array olusturur.
                                // [0,0,0,0,0]
    }
}
