package day34_accessModifier_encapsulation;

public class C02 {
    public static void main(String[] args) {

        C01 obj= new C01();

        obj.acikString="Bye";
        C01.aciksayi=50;

       //  C01.sayi=15; private access modifier'i oldugundan baska clas'dan erisim saglayamayiz
       // obj.method1;  private access modifier'i oldugundan baska clas'dan erisim saglayamayiz

       // C01 objParametreli=new C01(5); private access modifier'i oldugundan baska clas'dan erisim saglayamayiz

    }
}
