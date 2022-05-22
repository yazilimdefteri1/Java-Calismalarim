package day22_arrays;

public class K01_HarfBulmaCharAt {
    public static void main(String[] args) {

        String str = "Java ile IT cok guzel";

        int sayac = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i)=='e') {
                sayac++;
            }
        }
        System.out.println("Aradiginiz 'e' harfi " + sayac + " kere kullanilmis");
    }

}
