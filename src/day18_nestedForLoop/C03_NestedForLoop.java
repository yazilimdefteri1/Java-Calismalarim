package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /* Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore asagidaki sekli cizdirin
         *
         * *
         * * *
         * * * *
         */
        int satir = 8;

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= i; j++) {
                // nested for loop ya dikdörtgen veya ucgen formatinda olabilir
                // dikdörtgen istedigimizde iki loop icinde bagimsiz end point belirleriz (satir2) gibi
                // ucgen sekli vermek icin inner loop('un end pointini outer degiskene (i) bagimli yaparız
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
