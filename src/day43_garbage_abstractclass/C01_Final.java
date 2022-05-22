package day43_garbage_abstractclass;

public class C01_Final {
    final static double piSayisi=3.14;
    final static String okulIsmi="Yildiz Koleji";
    public static void main(String[] args) {

        final int sayi=10;
        // okulIsmi="Java Koleji"; Final olarak belirendigi icin degistirilemez
    }
/*
    public static final void method1(){
        Override parent class'daki methodu chid class'a uyarlamak demekti
        yani islevini degisdtirmek istiyoruz.
        Ancak parent class'daki method final olarak tanimlandigindan
        Java method'un uyralanmasina izin vermitoe

        System.out.println("Parent class final method1");

    }*/
}
