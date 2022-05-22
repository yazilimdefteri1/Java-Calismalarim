package day30_pasByValue;

public class C02_StaticBlocks {
    {
        System.out.println("static olmayan blok calisti");
    }
    static{
        System.out.println("static block calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method basi");

        C02_StaticBlocks obj1=new C02_StaticBlocks();
        C02_StaticBlocks obj2=new C02_StaticBlocks();
    }
}
