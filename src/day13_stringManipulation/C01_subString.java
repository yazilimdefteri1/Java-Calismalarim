package day13_stringManipulation;

import java.util.Arrays;

public class C01_subString {
    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";


        System.out.println(str.substring(5)); // ile IT cok guzel
        System.out.println(str.substring(10, str.length()));
        System.out.println(str.replace("Java", "Mehmet Hoca")); // burada  replace ile dedegisim yaptık
        System.out.println("Mehmet Hoca " + str.substring(5));
        System.out.println(str.substring(9));

        // Eger bir indexten sona kadar olan parcayi degil
        // belirli bir parcayi almak istersek
        // 2 parametre yazmak gerekir str.substring(baslangicIndexi,bitisIndexi)
        // baslangis indexi==> inclusive/dahil
        // bitis indexi==>eclusive/dahil degil
        System.out.println(str.substring(9, str.length()));
        System.out.println(str.substring(0, 5));
        String harf = (str.substring(5, 6));
        System.out.println(harf);

        str = "Java gun gectikce guzellesiyor";
        System.out.println(str.substring(7, 7)); // hiclik dondurur

        // System.out.println(str.substring(5,2)); //bitis indexi baslangic indexinden kucuk olamaz
        System.out.println(str.substring(str.length() - 1)); // son harfi verir
        System.out.println(str.substring(str.length() - 5)); // son 5 harfi yazdirir
        System.out.println(str.substring(str.length()));  // son harten sonraki kismi yani hiclik

    }
}
