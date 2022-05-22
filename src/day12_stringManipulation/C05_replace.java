package day12_stringManipulation;

public class C05_replace {
    public static void main(String[] args) {

        String str= "Bugun ne cok sey ogrendik";
        int str2;

        // Bu cümledeki bosluk disindaki karakter sayisini bulunuz

        System.out.println(str.replace(" ","").length());

        //  atama yapilmadigi surece orjinal String kalici olarak degismez
        // sadece o satir icin degisiklik yapilip sonuc yazdirilmis olur

        System.out.println("orjinal str karakter sayisi : "+str.length());

        // str da kalici degisiklik yapalim,
        // bugun yerine yarin
        // ogrendik yerine ogrenecegiz

        str=str.replace("Bugun","Yarin");
        str=str.replace("ogrendik", "ogrenecegiz");

        System.out.println(" Kalici degisiklikten sonra str : " + str);

        str.replace("ne cok","ne az");// atama yok ise sadece yazdiri isek gösterir. yoksa veriyi degistirmez
        System.out.println(str);


    }

}
