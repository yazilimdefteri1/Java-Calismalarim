package day34_deneme;

import day34_accessModifier_encapsulation.C01;

public class Deneme {
    public static void main(String[] args) {

        //01 obj=new C01();
        // constructor default access modifier'a sahip oldugundan
        // baska package'dan kullanilamaz

        C01.halkaAcikSayi=13;
        // C01.aileyeOzel=10;protected oldugu icin baska package dan ulasamıyoruz.
                            // Ayrıca childClass da degil
                            // childClass olsaydı ulasabilirdi.
    }
}
