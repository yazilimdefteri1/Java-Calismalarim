package day05_matematikselIslemler;
public class C00_Calisma {

    public static void main(String[] args) {

        //  Soru 1 ) byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        //  birer degisken olusturup adim adim widening yapin ve yazdirin
        byte sayi=30;
        short sayi1=sayi;
        System.out.println(sayi1);//30
        int sayi2=sayi1;
        System.out.println(sayi2);//30
        float sayi3=sayi2;
        System.out.println(sayi3);//30,0
        double sayi4=sayi3;
        System.out.println(sayi4);//30.0
        float sayi21=(float)sayi4;


        //Soru 2 ) int veri turunde bir degisken olusturun ve adim adim narrowing yapin ve yazdirin
        int sayi5=150;
        System.out.println(sayi5); //150
        short sayi6= (short) sayi5;
        System.out.println(sayi6);//150
        byte sayi7= (byte) sayi6;
        System.out.println(sayi7 );//-106
        //Soru 3 ) Float data turunde bir variable olusturun ve yazdirin
        float floatVar=30.8f;
        System.out.println(floatVar);//30.8
        // Soru 4 ) double 255.36 sayisini int’a ve sonra da olusturdugunuz int sayiyi byte’a cevirip yazdirin
        double sayi8=255.36;
        System.out.println(sayi8);//255.36
        int sayi9= (int) sayi8;
        System.out.println(sayi9);//255
        byte sayi10= (byte) sayi9;
        System.out.println(sayi10);//-1
        // Soru 5 ) int 2 sayiyi birbirine boldurun ve sonucu yazdirin
        int sayi11=60, sayi12=15;
        System.out.println(sayi11/sayi12);//4
        //Soru 6 ) int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
        int num1=60;
        double num2=5;
        System.out.println(num1/num2);//11.1111111
        // Soru 7 ) Farkli data tipleri ile islem yapip, sonuclarini yazdiralim
        byte num3=18;
        short num4=20;
        int num5=25;
        long num6=73;
        float num7=11.3f;
        double num8=24.6;
        System.out.println(num3*num4);//360
        System.out.println(num5/num6);//0
        System.out.println(num7+num8);//35.900000190734865
    }
}

