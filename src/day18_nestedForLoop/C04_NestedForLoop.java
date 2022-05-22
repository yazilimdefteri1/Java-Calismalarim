package day18_nestedForLoop;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         *****
         ****
         ***
         **
         *
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
        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= (satir - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}