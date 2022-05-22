package day37_inheritance;

import day36_inheritance.Parent;

public class Child  extends Parent {

    // bir class'i child class yaptigimizda
    // parent class'daki constructor'a ulasmasi gerekir
    // bu durumda parent class'daki constructor'in
    // access modifier'i uygun bir modifier yapilmalidir.

    Child(){
        super();
        System.out.println("child class parametresiz constructor");
    }
    Child(int s){
        // Child class'da  tum constructor'larin ilk satirina
        // Java'nin yerlestirdigi constructor PARAMETRESİZ dir yani super()
        super(); // yazmasak burada bu java tarafindan konmaktadir
        System.out.println("Child class parametreli cons");
    }

    public Child(int sayi1, int sayi2) {
        // eger parent class'dan parametresiz constructor'i degil de
        // baska bir constructor'i  calistirmak isterseniz
        // bunu Child class'daki constructor'in ILK SATIRINA yazmalisiniz
        super(5,8);
        System.out.println("iki parametreli cons");
    }


    public static void main(String[] args) {
        Child child=new Child(5,8);

    }
}
