package day30_pasByValue;

public class C01_StaticBlocks {
   static  { // class calismaya baslamadan once yapmamiz gereken on atamalr varsa onlari yapar.

       /* static block class ilk calismaya basladiginda devereye girer
       ve class'in calismasi icin gerekli on hazirliklar icin kullanilir
       yazildigi satirin hicbir önemi yoktur, class icerisinde istenen yere yazilabilir.
       static block birden fazla olursa, bloklar yukaridan asagi dogru sirayla calsiir.
        */
       System.out.println("Static block1 calisti");

   }
    static  {
        System.out.println("Static block2 calisti");

    }
    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        C01_StaticBlocks obj1;
        new C01_StaticBlocks();
        System.out.println("main method sonu");

    }
}
