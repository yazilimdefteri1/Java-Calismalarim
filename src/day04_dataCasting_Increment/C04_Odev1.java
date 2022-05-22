package day04_dataCasting_Increment;

public class C04_Odev1 {
    public static void main(String[] args) {

        // SORU 1)

        byte a =10;
        short b = a;
        int c= b;
        long d =c;
        float e=d;
        double f=e;

        System.out.println(f);
        System.out.println("===============================");
// sORU2)

        float h = (float) f;
        long i = (long) h;
        int j = (int) i;
        short k = (short) j;
        byte l = (byte) k;
        System.out.println(l);
        System.out.println("----------------------------------");

        // sORU3 )

        float num01= 10.5f;
        System.out.println(num01);
        System.out.println("-----------------------------------");

        //sORU 4)
        double num02=255.36 ;
        int num03= (int) num02;
        byte num04= (byte) num03;
        System.out.println(num04);

        //sORU6 )
        int num06=14;
        int num07=2;
        System.out.println(num06 + " / " + num07 + " = " + (num06/num07));

        double num08=4;
        System.out.println(num06/num08);
    }
    }

