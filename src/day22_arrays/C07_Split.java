package day22_arrays;

import java.util.Arrays;

public class C07_Split {
    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        String kelimeler[] = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));

        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println(kelimeler[i]);
        }

        String gectikce[] = str.split("gectikce");
        System.out.println(Arrays.toString(gectikce));

        for (int i = 0; i < gectikce.length; i++) {
            System.out.println(gectikce[i]);
        }

        String harfler[]=str.split("");
        System.out.println(Arrays.toString(harfler));


        for (int i = 0; i < harfler.length; i++) {
            System.out.print(harfler[i]+ " ");
        }

    }
}
