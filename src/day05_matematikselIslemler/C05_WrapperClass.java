package day05_matematikselIslemler;

import com.sun.jdi.IntegerValue;

public class C05_WrapperClass {
    public static void main(String[] args) {

        float sayi1=20.5f;
        Float sayi2=30.6f;

        sayi1=sayi2;  //  Wrapper Class ile ayni isimdeki primitive data turu arasinde gecis olabilir

        System.out.println(sayi1);

        System.out.println(Short.MAX_VALUE);  // 32767
        System.out.println(Short.MIN_VALUE);   //-32768
        System.out.println(Short.BYTES);  //2 Byte,
        System.out.println(Short.TYPE);
        System.out.println(Short.SIZE);

    }
}
