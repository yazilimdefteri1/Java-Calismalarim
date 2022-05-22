package day27_constructor;

import org.w3c.dom.ls.LSOutput;

public class ToyotaRunner {
    public static void main(String[] args) {
        Toyota t1= new Toyota();
        System.out.println(t1.marka); // Toyota
        System.out.println(t1.tekerAdedi); // 4
    System.out.println(t1.model); // null
        System.out.println(t1.yil); // 0
        t1.model="Corolla";
        t1.yil=2022;
        t1.yakit="Benzin";
        System.out.println("T1 model : " +t1.model+ " , yakit : "+t1.yakit+" , yil : "+ t1.yil);
        t1.maxHiz();
        Toyota t2=new Toyota();
        System.out.println(t2.model); // null sonucu verir atama yapilmadigi icin
        t2.model="Yaris";
        t2.yil=2022;
        t2.yakit="Dizel";
        System.out.println("T2 model : " +t2.model+ " , yakit : "+t2.yakit+" , yil : "+ t2.yil);
        t2.maxHiz();
        t1.renkTercihleri();
        t2.renkTercihleri();
    }
}
