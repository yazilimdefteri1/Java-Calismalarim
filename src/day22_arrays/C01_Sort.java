package day22_arrays;

import java.util.Arrays;

public class C01_Sort {
    public static void main(String[] args) {

        String arr[] = {"S", "M", "A", "T"};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // Java da bu siralamaya Natural Order denir
        // sayi olursa kucukten buyuge
        // metin olursa alfabetik siralamaya gore


        int[] intSayı = new int[5];
        for (int i = 0; i < intSayı.length; i++)
            intSayı[i] = i * 10;
        for (int i = 0; i < intSayı.length; i++)
            System.out.println("intSayı[" + i + "] = " + intSayı[i]);

        double[] aylıkÜcret = new double[3];
        aylıkÜcret[0] = 2782.45;
        aylıkÜcret[1] = 9346.74;
        aylıkÜcret[2] = 10867.83;

        double[] gelirVergisi = new double[3];
        for (int i = 0; i < aylıkÜcret.length; i++) {
            gelirVergisi[i] = aylıkÜcret[i] * 30 / 100;

            System.out.println("Aylık " + aylıkÜcret[i] + " TL ücretin gelir vergisi = " + gelirVergisi[i]);

        }
    }
}
