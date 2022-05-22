package day05_matematikselIslemler;

public class C06_WrapperClass {
    public static void main(String[] args) {

        String str1="12345";
        String str2="23456";

        //  verilen iki string deki sayilari toplayın

        System.out.println(str1 + str2);
        System.out.println(str1 + " " + str2);

        System.out.println(Integer.valueOf(str1) + Integer.valueOf(str2));

        //Integer.valueOf methodu sadece sayisal degeri iceren Stringlerde kullanilabilir
        //Bir tane bile sayi disinda karakter olursa java hata verir.

        int sayi3= Integer.valueOf(str1);  //ekstra yaptım
        System.out.println(sayi3);







    }
}
