package day40_overriding_polymorphism;

public class C04_Exceptions {

    // String olarak verilen bir sayiyi, integer'a cevirip
    // 2 katini ekranda yazdiralim

    public static void main(String[] args) {

        String str="1234a";
        // str icinde sayi olmayan bir karakter olursa
        // NumberFormatException: For input string: "1234a" verir


        try {
            int sayi=Integer.parseInt(str);
            System.out.println("Girilen sayinin 2 kati : " + 2*sayi);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Girdiginiz string sayi olamayan elemetler iceriyor");
        }
    }
}
